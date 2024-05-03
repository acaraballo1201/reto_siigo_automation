package co.com.reto_siigo_automation.certificacion.interactions.esperas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Presente implements Task {
  private final Target elemento;

  public Presente(Target elemento) {
    this.elemento = elemento;
  }

  @Step("Espera #elemento presente")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(elemento, isPresent()).forNoMoreThan(20).seconds());
  }
}
