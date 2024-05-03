package co.com.reto_siigo_automation.certificacion.stepDefinitions.authentication;

import co.com.reto_siigo_automation.certificacion.exceptions.MenuSiigoNoVisualizadoException;
import co.com.reto_siigo_automation.certificacion.interactions.AutenticacionPoo;
import co.com.reto_siigo_automation.certificacion.questions.ElementoEsperado;

import co.com.reto_siigo_automation.certificacion.tasks.IngresarAMenu;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


import static co.com.reto_siigo_automation.certificacion.exceptions.MenuSiigoNoVisualizadoException.MENU_VALIDACION_NO_ENCONTRADO;
import static co.com.reto_siigo_automation.certificacion.userInterfaces.LoginPage.MENSAJE_CREAR_TERCERO;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Dado("que {string} ingresa con el usuario: {string} y la clave: {string}")
    public void inicioSesion(String nombreActor, String usuario, String clave) {
        theActorCalled(nombreActor).attemptsTo(AutenticacionPoo.enSiigo(usuario, clave));
    }

    @Dado("el ingresa al menu de crear clientes")
    public void menuCrear() {
        theActorInTheSpotlight().attemptsTo(IngresarAMenu.deClientes());
    }

    @Entonces("el podra observar el catalogo de servicio")
    public void verificarVisibilidadProductos() {
        theActorInTheSpotlight().should(seeThat(ElementoEsperado.esVisible(MENSAJE_CREAR_TERCERO))
                .orComplainWith(MenuSiigoNoVisualizadoException.class, MENU_VALIDACION_NO_ENCONTRADO));
    }
}