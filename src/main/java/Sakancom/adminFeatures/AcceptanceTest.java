package Sakancom.adminFeatures;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\USER-Q\\Desktop\\Sakancom\\src\\main\\Features",
        plugin = {"summary","html:target/cucumber/report.html"},
        monochrome = true, //readable output on console.
        snippets = SnippetType.CAMELCASE,
        glue = "Sakancom.adminFeatures"
)
public class AcceptanceTest {

}

