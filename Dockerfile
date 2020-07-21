FROM maven:3.6.3-jdk-8-openj9

# We need wget to set up the PPA and xvfb to have a virtual screen and unzip to install the Chromedriver
RUN apt-get update -y \
    && apt-get install -y wget xvfb unzip
    
RUN apt-get install -y gnupg2


# Set up the Chrome PPA
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && echo "deb http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list

# Update the package list and install chrome
RUN apt-get update -y \
    && apt-get install -y google-chrome-stable

# Put google chrome browser into the PATH
ENV PATH google-chrome-stable:$PATH

# Set up Chromedriver Environment variables
ENV CHROMEDRIVER_VERSION 84.0.4147.30
ENV CHROMEDRIVER_DIR /chromedriver
RUN mkdir $CHROMEDRIVER_DIR

# Download and install Chromedriver
RUN wget -q --continue -P $CHROMEDRIVER_DIR "http://chromedriver.storage.googleapis.com/$CHROMEDRIVER_VERSION/chromedriver_linux64.zip" \
    && unzip $CHROMEDRIVER_DIR/chromedriver* -d $CHROMEDRIVER_DIR

# Put Chromedriver into the PATH
ENV PATH $CHROMEDRIVER_DIR:$PATH

RUN mkdir -p /usr/airasia/target
WORKDIR /usr/airasia

# copy the project files
COPY ./pom.xml ./pom.xml

# build all dependencies
RUN mvn dependency:go-offline -B

# copy your other files
COPY ./ ./

# build for release
RUN mvn clean package

ENTRYPOINT ["mvn", "verify", "-Dwebdriver.remote.url=http://selenium_chrome:4444/wd/hub", "-Dwebdriver.remote.driver=chrome"]