package com.reto_siigo_automation.certificacion.interactions.esperas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Clickable implements Interaction {

  private final Target elemento;

  public Clickable(Target elemento) {
    this.elemento = elemento;
  }

  @Step("Espera #elemento clickable")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Esperar.unTiempo(3000), WaitUntil.the(elemento, isClickable()).forNoMoreThan(20).seconds());
  }
}
