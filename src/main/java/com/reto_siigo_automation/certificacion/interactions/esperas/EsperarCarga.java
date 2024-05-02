package com.reto_siigo_automation.certificacion.interactions.esperas;

import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.StaleElementReferenceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.reto_siigo_automation.certificacion.userInterfaces.auntenticacion.LoginPage.BTN_ALERTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class EsperarCarga implements Interaction, IsSilent {

  private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
  private int intentos = 0;

  public static EsperarCarga desaparezca() {
    return instrumented(EsperarCarga.class);
  }

  private <T extends Actor> void esperando(T actor) {
    while (intentos < 10) {
      if (!Presence.of(BTN_ALERTA).answeredBy(actor)) {
        actor.attemptsTo(
            Esperar.unTiempo(5000),
            WaitUntil.the(BTN_ALERTA, isNotVisible()).forNoMoreThan(60).seconds());
      }
      actor.attemptsTo(Esperar.unTiempo(5000));
      if (Presence.of(BTN_ALERTA).answeredBy(actor)) {
        break;
      }
      intentos++;
    }
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    try {
      esperando(actor);
    } catch (StaleElementReferenceException e) {
      LOGGER.info(String.valueOf(e));
    }
  }
}
