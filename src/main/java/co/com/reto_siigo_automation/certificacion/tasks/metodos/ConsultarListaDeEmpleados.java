package co.com.reto_siigo_automation.certificacion.tasks.metodos;

import co.com.reto_siigo_automation.certificacion.interactions.apis.ConsumoServicios;
import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ConsultarListaDeEmpleados implements Task {

    GestionarDatos Data = new GestionarDatos();

    public static ConsultarListaDeEmpleados enApi() {
        return Tasks.instrumented(ConsultarListaDeEmpleados.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        assertThat(Data.obtenerDatos("statusCode"),equalTo("200"));
        Data.guardarDatos("statusCode", String.valueOf(SerenityRest.lastResponse().statusCode()));
        Data.guardarDatos("status", SerenityRest.lastResponse().jsonPath().getString("status"));
        }

    }
