package runner;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;

@CucumberOptions(
        features = "src/test/resources/Feature",
        glue= "step",
        plugin= {"pretty","html:target/cucumber-reports.html"},
        monochrome = true

)



public class TestngCucumber extends AbstractTestNGCucumberTests {
}
