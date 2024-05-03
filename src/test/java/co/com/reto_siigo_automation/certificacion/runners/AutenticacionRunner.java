package co.com.reto_siigo_automation.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@Slf4j
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion/autenticacion.feature",
        glue = "co/com/reto_siigo_automation/certificacion/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class AutenticacionRunner {

}