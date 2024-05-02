package com.reto_siigo_automation.certificacion.stepDefinitions;


import com.reto_siigo_automation.certificacion.exceptions.autenticacion.MenuSvpNoVisualizadoException;
import com.reto_siigo_automation.certificacion.questions.transverales.ElementoEsperado;
import com.reto_siigo_automation.certificacion.tasks.autenticacion.IniciarSesion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.reto_siigo_automation.certificacion.exceptions.autenticacion.MenuSvpNoVisualizadoException.MENU_VALIDACION_NO_ENCONTRADO;
import static com.reto_siigo_automation.certificacion.userInterfaces.auntenticacion.LoginPage.BTN_CREAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

  @Given("que {string} ingresa con el usuario: {string} y la clave: {string}")
  public void inicioSesion(String nombreActor, String usuario, String clave) {
    theActorCalled(nombreActor).attemptsTo(IniciarSesion.enSiigo(usuario, clave));
  }

  @Then("el puede observar su catalogo de servicio")
  public void verificarVisibilidadProductos() {
    theActorInTheSpotlight().should(seeThat(ElementoEsperado.esVisible(BTN_CREAR))
            .orComplainWith(
                    MenuSvpNoVisualizadoException.class, MENU_VALIDACION_NO_ENCONTRADO));
  }

}
