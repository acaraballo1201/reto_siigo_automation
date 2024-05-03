package co.com.reto_siigo_automation.certificacion.runners.webRunners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/auto_web/autenticacion/autenticacion.feature",
        glue = "co/com/reto_siigo_automation/certificacion/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class AutenticacionRunner {

}