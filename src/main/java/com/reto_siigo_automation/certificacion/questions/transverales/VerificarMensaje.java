package com.reto_siigo_automation.certificacion.questions.transverales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.reto_siigo_automation.certificacion.userInterfaces.auntenticacion.LoginPage.MSG_APLICACION;

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
