package com.reto_siigo_automation.certificacion.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion.feature",
        glue = "com.reto_siigo_automation.certificacion.stepDefinitions")

public class AutenticacionRunner {
}
