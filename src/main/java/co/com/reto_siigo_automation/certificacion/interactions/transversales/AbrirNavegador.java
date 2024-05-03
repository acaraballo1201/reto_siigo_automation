package co.com.reto_siigo_automation.certificacion.interactions.transversales;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AbrirNavegador implements Interaction {

  public static AbrirNavegador enSiigo() {
    return instrumented(AbrirNavegador.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acaraballo\\Documents\\retos\\automation_siigo\\co.com.siigo_automation.certificacion\\src\\test\\resources\\driver\\chromedriver.exe");
    getDriver().manage().window().maximize();
    actor.attemptsTo(Open.url("https://qastaging.siigo.com/#/login"));
  }
}
