package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSearchStepDefination {
    WebDriver driver;
    @Given(": open the  goodle application")
    public void open_the_goodle_application() {
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }
    @When("Enter the valid cityname and serach it")
    public void enter_the_valid_cityname_and_serach_it() {
        WebElement serach = driver.findElement(By.name("q"));
        serach.sendKeys("mumbai");

    }
    @Then("verify  search data should  appeared")
    public void verify_search_data_should_appeared() {
  WebElement s= driver.findElement(By.xpath("// div[text()='Mumbai']"));
        Assert.assertTrue(s.isDisplayed());
        driver.close();
    }

}
