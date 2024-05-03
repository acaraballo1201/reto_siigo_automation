package co.com.reto_siigo_automation.certificacion.interactions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import org.junit.Assert;

import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.ELIMINAR_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConDeleteEliminarEmpleado implements Interaction {
    GestionarDatos Data = new GestionarDatos();

    public static ConDeleteEliminarEmpleado enApi() {
        return instrumented(ConDeleteEliminarEmpleado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(String.format(ELIMINAR_USUARIO.toString(),Data.obtenerDatos("empleadoBorrar")))
                .with(requestSpecification -> requestSpecification));

        Assert.assertEquals(204, SerenityRest.lastResponse().statusCode());
    }
}
