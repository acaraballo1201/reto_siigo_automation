package co.com.reto_siigo_automation.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.reto_siigo_automation.certificacion.userInterfaces.LoginPage.MSG_APLICACION;


public class VerificarMensaje implements Question<Boolean> {

  private final String mensaje;

  public VerificarMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public static VerificarMensaje esVisible(String mensaje) {
    return new VerificarMensaje(mensaje);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return !MSG_APLICACION.of(mensaje).resolveAllFor(actor).isEmpty();
  }
}
