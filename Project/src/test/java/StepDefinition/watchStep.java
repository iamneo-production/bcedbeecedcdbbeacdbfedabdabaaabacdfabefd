package StepDefinition;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.aventstack.extentreports.ExtentReports;
import Pages.*;
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
    private Watch testcase1;
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
                    testcase1 = new Watch(driver);
                    url.LaunchSite(driver);
        }



        @When("^I hover over the search icon and input \"([^\"]*)\" and press Enter$")
        public void i_hover_over_the_search_icon_and_input_and_press_Enter(String arg1) throws Throwable {
            testcase1.searchIcon();
        }

        @Then("^I store the title of the first watch result$")
        public void i_store_the_title_of_the_first_watch_result() throws Throwable {
        
        }


        @Then("^I click on \"([^\"]*)\"$")
        public void i_click_on(String arg1) throws Throwable {
            
        }

        @Then("^I verify the selected product title matches the displayed product title$")
        public void i_verify_the_selected_product_title_matches_the_displayed_product_title() throws Throwable {
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
