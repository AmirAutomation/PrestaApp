package co.com.project.automation.prestaApp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/PrestaApp.feature",
        tags = "@Regression",
        glue = "co.com.project.automation.prestaApp.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunTags {
}





