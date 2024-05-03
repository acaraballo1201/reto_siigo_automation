package co.com.reto_siigo_automation.certificacion.stepDefinitions.api;

import co.com.reto_siigo_automation.certificacion.tasks.metodos.ConsultarListaDeEmpleados;
import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ApisStepDefinitions {

    GestionarDatos Data = new GestionarDatos();
    @Dado("que Andres usa el servicio {string}")
    public void iniciarApi(String urlBase) throws IOException {
        Data.datosPrueba(urlBase);
        CommonStep.PrepararEscenario(Data.obtenerDatos(urlBase));
    }

    @Cuando("^El consume el servicio para consultar todos los empleados$")
    public void ElConsumeElServicioParaConsultarTodosLosEmpleados() {
        theActorInTheSpotlight().attemptsTo(ConsultarListaDeEmpleados.enApi());
    }

    @Cuando("el Consume el Servicio para consultar el empleado {int}")
    public void ElConsumeElServicioParaConsultarElEmpleado(int empleado) {
        Data.guardarDatos("empleado", String.valueOf(empleado));
        theActorInTheSpotlight().attemptsTo(ConsultarListaDeEmpleados.enApi());
    }

    @Cuando("el realiza el Consumo del servicio para la creacion")
    public void condumirServicioDeCreacion() {
    }

    @Y("el esperara recibir un mensaje de stado {string}")
    public void validarMensajeDeEstado(String status) {
    }

    @Entonces("el esperara un codigo de estado {int}")
    public void validarCodigoDeEstado (int statusCode) {
    }

}