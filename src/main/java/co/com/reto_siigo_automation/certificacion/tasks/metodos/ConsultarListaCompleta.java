package co.com.reto_siigo_automation.certificacion.tasks.metodos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConsultarListaCompleta implements Task {


    public static ConsultarListaCompleta deEmpleados( ){
        return Tasks.instrumented(ConsultarListaCompleta.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

//        actor.attemptsTo(ConsumoDeServicios.conGetEmpleados());
//        Data.guardarDatos("status", SerenityRest.lastResponse().jsonPath().getString("status"));
//        Data.guardarDatos("statusCode", String.valueOf(SerenityRest.lastResponse().statusCode()));
    }

}