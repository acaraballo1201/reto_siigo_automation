package co.com.reto_siigo_automation.certificacion.interactions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.junit.Assert;

import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.EMPLEADO_ESPECIFICO;

public class ConsultarEmpleadoEspecifico implements Interaction {
    GestionarDatos Data = new GestionarDatos();

    public static ConsultarEmpleadoEspecifico enApi() {
        return Tasks.instrumented(ConsultarEmpleadoEspecifico.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(String.format(EMPLEADO_ESPECIFICO.toString(),Data.obtenerDatos("empleado")))
                .with(requestSpecification -> requestSpecification));

        Assert.assertEquals(200, SerenityRest.lastResponse().statusCode());
        System.out.println("si se obtuvo codigo 200");

    }
}

