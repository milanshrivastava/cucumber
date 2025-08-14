package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class LoginStepFile {
    WebDriver driver;
    @Given(": open the application")
    public void open_the_application() {
        driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();


    }
    @When(": Enter the valid username and valid password")
    public void enter_the_valid_username_and_valid_password() {
        driver.findElement(By.id("login1")).sendKeys("milanshrivastava");
        driver.findElement(By.name("passwd")).sendKeys("a12333");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    @Then(": Verify login the  should sucessfully done")
    public void verify_login_should_sucessfully_done() {
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(driver.getTitle(),"Rediffmail - Free Email for Login with Secure Access");
        softAssert.assertAll();

    }




}
