package co.com.reto_siigo_automation.certificacion.interactions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.EMPLEADO_ESPECIFICO;

public class ConGetEmpleado implements Interaction {
    GestionarDatos Data = new GestionarDatos();
    public ConGetEmpleado() {}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource(String.format(EMPLEADO_ESPECIFICO.toString(),Data.obtenerDatos("empleado")))
                .with(requestSpecification -> requestSpecification
                        ));





    }
}

