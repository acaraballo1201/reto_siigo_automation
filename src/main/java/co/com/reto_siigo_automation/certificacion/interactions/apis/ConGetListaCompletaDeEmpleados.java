package co.com.reto_siigo_automation.certificacion.interactions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;
import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.LISTA_COMPLETA_DE_EMPLEADOS;

public class ConGetListaCompletaDeEmpleados implements Interaction {
    public ConGetListaCompletaDeEmpleados() {}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(LISTA_COMPLETA_DE_EMPLEADOS.toString())
                .with(requestSpecification -> requestSpecification
                        ));
    }
}

