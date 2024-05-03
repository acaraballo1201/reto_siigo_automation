package co.com.reto_siigo_automation.certificacion.interactions.esperas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Visible implements Interaction {

  private final Target elemento;

  public Visible(Target elemento) {
    this.elemento = elemento;
  }

  @Step("Esperar #elemento visible")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(elemento, isVisible()).forNoMoreThan(30).seconds());
  }
}
