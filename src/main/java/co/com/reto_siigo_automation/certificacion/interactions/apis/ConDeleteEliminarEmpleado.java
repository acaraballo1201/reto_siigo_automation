package co.com.reto_siigo_automation.certificacion.interactions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.ELIMINAR_EMPLEADO;

public class ConDeleteEliminarEmpleado implements Interaction {
    GestionarDatos Data = new GestionarDatos();

    public ConDeleteEliminarEmpleado() {}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Delete.from(String.format(ELIMINAR_EMPLEADO.toString(),Data.obtenerDatos("empleadoBorrar")))
                .with(requestSpecification -> requestSpecification));


    }
}
