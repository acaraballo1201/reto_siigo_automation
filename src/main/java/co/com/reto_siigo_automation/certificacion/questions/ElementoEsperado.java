package co.com.reto_siigo_automation.certificacion.questions;

import co.com.reto_siigo_automation.certificacion.interactions.transversales.ClickInvisible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static co.com.reto_siigo_automation.certificacion.userInterfaces.LoginPage.BTN_ALERTA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ElementoEsperado implements Question<Boolean> {

  private final Target elemento;

  public ElementoEsperado(Target elemento) {
    this.elemento = elemento;
  }

  public static ElementoEsperado esVisible(Target elemento) {
    return new ElementoEsperado(elemento);
  }

  @Step("Espera #elemento es visible")
  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultado = elemento.resolveFor(actor).isVisible();
    if (Visibility.of(BTN_ALERTA).answeredBy(actor)) {
      theActorInTheSpotlight().attemptsTo(ClickInvisible.enReporte(BTN_ALERTA));
    }
    return resultado;
  }
}
