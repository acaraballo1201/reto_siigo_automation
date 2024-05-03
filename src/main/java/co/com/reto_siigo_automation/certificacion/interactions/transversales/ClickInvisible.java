package co.com.reto_siigo_automation.certificacion.interactions.transversales;

import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickInvisible implements IsSilent, Interaction {

  private final Target elemento;

  public ClickInvisible(Target elemento) {
    this.elemento = elemento;
  }

  public static ClickInvisible enReporte(Target elemento) {
    return instrumented(ClickInvisible.class, elemento);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(elemento));
  }
}
