package co.com.project.automation.prestaApp.runners;

import co.com.project.automation.prestaApp.util.BeforeSuite;
import co.com.project.automation.prestaApp.util.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src/test/resources/features/PrestaApp.feature",
        glue = "co.com.project.automation.prestaApp.stepdefinitions",
        tags = "@T001",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class Run {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/PrestaApp.feature");
    }
}