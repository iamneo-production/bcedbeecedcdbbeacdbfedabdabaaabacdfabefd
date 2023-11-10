package Pages;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import cucumber.api.PendingException;
import Utils.*;
import UiStore.*;


public class Watch {
    Base base = new Base();
    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    private WebDriverHelper driverHelper;
    private watchUI watchUI;
    private ExtentReports reporter = Reporter.generateExtentReport();
    LoggerHandler log = new LoggerHandler();
    Actions actions;
   

    public Watch(WebDriver driver) {
        System.out.println(" drive instance one being created");
        this.driver = driver;
        driverHelper = new WebDriverHelper(driver);
        actions = new Actions(driver);
    }
    
    private ExtentTest test = reporter.createTest("Homepage", "PURIHOLIDAY");
   
    public void searchIcon() throws Throwable {
        try {
            System.out.println("helo");
            try {
                driverHelper.hoverAndClickElement(driver, watchUI.searchIcon(), watchUI.searchBar());
            }     
                            
        } catch (Exception e){
            log.logError("Exception occurred while performing Homepage");
            e.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Homepage Error");
            test.fail("Failed to perform Click Close", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());

        }
    }
// public void enterKeys() throws Throwable {
//         try {
//             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//             driverHelper.
//             log.logInfo("Dates Clicked");
            
//         } catch (Exception e) {
//             log.logError("Exception occurred while performing Homepage");
//             e.printStackTrace();
//             String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "dateclick Error");
//             test.fail("Failed to date Click ", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());


//         }
                      
//     }
//     public void book_btn() throws Throwable {
//         try {
//             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//             driverHelper.clickOnElement(homepageUI.getBookButtonLocator());

            
//         } catch (Exception e) {
//             LoggerHandler.logError("Exception occurred while performing click book btn");
//             e.printStackTrace();
//             String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "book btn Error");
//             test.fail("Failed to Click book ", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//         }
                      
//     }

//      public void see_details() throws Throwable {
//         try {
//             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//             driverHelper.clickOnElement(homepageUI.htl_details());

            
//         } catch (Exception e) {
//             LoggerHandler.logError("Exception occurred while performing see details");
//             e.printStackTrace();
//             String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "book btn Error");
//             test.fail("Failed to see details ", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//         }
                      
//     }

//        public void verify_details() throws Throwable {
//       try {
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//     WebElement keyword = driver.findElement(By.xpath("//div/h4[contains(text(),'Standard Rate')]"));
//     String actualText = keyword.getText();
//     String expectedText = "Standard Rate";
//     assertEquals(expectedText, actualText);
//     System.out.println("Assert Successfull");
// } catch (Exception e) {
//     LoggerHandler.logError("Exception occurred while verifying Standard Rate");
//     e.printStackTrace();
//     String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "StandardRateVerificationError");
//     test.fail("Failed to verify Standard Rate", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
// }

                      
    }

// }



