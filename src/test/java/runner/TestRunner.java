package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\orfat\\IdeaProjects\\PrinterlogicBDD\\src\\main\\java\\feature\\InvalidLogIn.feature"},
        glue = {"stepDefinition"},
        //format=  {"pretty", "html:test-output"}
        format = {"pretty", "json:report/cucumber.json", "html:report/cucumber-pretty"},
        strict = false,
        monochrome = true,
        tags = {"@invalid"},
        dryRun = false
)

public class TestRunner {
}
