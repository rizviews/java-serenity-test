
[![Build Status](https://travis-ci.com/rizviews/airasia-test-task1.svg?branch=master)](https://travis-ci.com/rizviews/airasia-test-task1)

# AirAsia Test -  Task 1

## Task Description

Explore www.airasia.com and define and automate two test cases of choice (language and framework of choice, preferred Java and Selenium). As part of the development team, how would you establish the process from identifying feature requirements to automating the test scenarios. 
Deliverables:
a.Translate the test cases into an automation suite using any of your preferred toolset like selenium
b. The entire test suite should be dockerised, so that we can run your docker image and that takes care of entire setup and then runs the test suite
c.A github action/travis CI pipeline ready with proper steps to run your automation suite

## Solution

This framework is only supporting to run in Chrome, multiple browser support could be added in future. 

### Test Cases

#### Test Case 1
```
Feature: User management
    
    @signup-invalid
    Scenario: Sign up attempt with invalid email address
        Given I click on Signup menu
        And I enter email and password
        | email | password |
        | abcd | abcdfd | 
        When I press signup button
        Then Error message should appear with text 'Please enter a valid email (e.g: example@email.com)'
        And I should remain in the signup page
```

#### Test Case 2

```
Feature: Verify flights screen and booking

    @test=flights
    Scenario: Flights screen loaded as expected
        Given I click on 'Flights'
        When I enter proper data
        | From | To | DepartDate | ReturnDate | Adult | Type |
        | Kuala Lumpur | Dhaka | 01/12/2020 | 02/12/2020 | 1 | Return |
        And I hit the search button
        Then Depart section should display proper data
        | Route | Date | FlightStart | FlightEnd | Price |
        | Kuala Lumpur to Dhaka | 01/12/2020 | 22:10 | 00:05 | 594.00 |
        And Total should show total Price
        And I should see a continue button
```

### Tools & Language

* Java
* Serenity BDD (https://serenity-bdd.github.io/theserenitybook/latest/cucumber.html)
* Maven
* Docker

### Run locally

* clone `https://github.com/rizviews/airasia-test-task1.git`
* Run `mvn install`
* Run `mvn clean verify` (run all tests)
* `mvn verify -Dcucumber.options="--tags @test=flights"` (to run specific test with matching tag)

### Run using docker

` docker-compose up --build --force-recreate --abort-on-container-exit`

### CI
https://travis-ci.com/github/rizviews/airasia-test-task1

### Docker image
https://hub.docker.com/repository/docker/rizviews/serenity-bdd

### Limitation/To Do
* Supports chrome only
* Not supporting passing any argument to docker compose
* Flight search > after hitting search button with new `Depart date` and `Return date` value, still passing default value.
