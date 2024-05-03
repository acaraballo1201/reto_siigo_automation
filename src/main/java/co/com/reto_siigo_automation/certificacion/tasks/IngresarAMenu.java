package co.com.reto_siigo_automation.certificacion.tasks;

import co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.ClickEn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAMenu implements Task {

    public static IngresarAMenu deClientes() {
        return instrumented(IngresarAMenu.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickEn.botonEntrar(),
                ClickEn.botonClientes());
    }
}
