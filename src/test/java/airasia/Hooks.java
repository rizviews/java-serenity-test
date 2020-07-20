
package airasia;

import airasia.navigation.NavigateActions;
import io.cucumber.java.Before;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;

public class Hooks {

    @Steps
    NavigateActions navigate;

    @Before public void navigateToHomepage() {        
        navigate.navigateToTheHomepage();
    }    
}