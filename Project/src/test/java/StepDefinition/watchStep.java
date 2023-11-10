package StepDefinition;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.aventstack.extentreports.ExtentReports;
import Pages.*;
import Pages.Url;
import UiStore.watchUI;
import Utils.Base;
import Utils.LoggerHandler;
import Utils.Reporter;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import  org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class watchStep{
   // ExtentReports extent = new ExtentReports();
   private ExtentReports reporter;
    private Url url;
    private watchUI testcase1;
    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    Base base = new Base();

    public watchStep() { 
    }

    @Before
    public void setUp() throws MalformedURLException {
      // extent = Reporter.generateExtentReport();
      reporter = Reporter.generateExtentReport();
    }
        
@Given("^I am on the World Art Community website to check Watches$")
public void i_am_on_the_World_Art_Community_website_to_check_Watches() throws Throwable{
  driver = base.openBrowser();
            driver.manage().window().maximize();
            url = new Url(driver);
            testcase1 = new Bookhotel(driver);
            url.LaunchSite(driver);
}



@When("^I select the IN option and choose a date that is at least (\\d+) days ahead$")
public void i_select_the_IN_option_and_choose_a_date_that_is_at_least_days_ahead(int arg1) throws Throwable {
    // testcase1.dates();
}

@When("^I click the Book Now button$")
public void i_click_the_Book_Now_button() throws Throwable {
   
}

@When("^I click on See Details for the first hotel$")
public void i_click_on_See_Details_for_the_first_hotel() throws Throwable {
    // testcase1.see_details();
}

@Then("^I should see the label standard Standard Rate$")
public void i_should_see_the_label_standard_Standard_Rate() throws Throwable {
//    testcase1.verify_details();
}

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
        // Flush the ExtentReports instance to save the report
    if (reporter != null) {
        reporter.flush();
    }
    }

}
