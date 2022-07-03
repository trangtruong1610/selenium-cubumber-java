package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/BackgroundDemo/BackgroundDemo.feature"},
        glue = {"BackgroundDemo"},
        plugin = {"pretty", "html:src/target/HtmlReports/report.html", "junit:src/target/JUnitReports/report.xml", "json:src/target/JsonReports/report.json"}
)
public class TestRunnerWithBackground {
}
