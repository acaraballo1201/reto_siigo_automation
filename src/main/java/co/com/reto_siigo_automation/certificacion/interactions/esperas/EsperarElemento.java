package co.com.reto_siigo_automation.certificacion.interactions.esperas;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperarElemento {

  private EsperarElemento() {}

  public static Clickable esClickable(Target elemento) {
    return instrumented(Clickable.class, elemento);
  }

  public static Visible esVisible(Target elemento) {
    return instrumented(Visible.class, elemento);
  }

  public static Presente esPresente(Target elemento) {
    return instrumented(Presente.class, elemento);
  }
}