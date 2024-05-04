package co.com.reto_siigo_automation.certificacion.tasks;

import co.com.reto_siigo_automation.certificacion.interactions.esperas.Esperar;
import co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.crearTerceros.EscribirEn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.reto_siigo_automation.certificacion.userInterfaces.CrearTerceroPage.BTN_GUARDAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearTercero implements Task {

    public static CrearTercero enSiigo() {
        return instrumented(CrearTercero.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EscribirEn.cajaTextoCedula(),
                EscribirEn.cajaTextoNombre(),
                EscribirEn.cajaTextoApellido(),
                Esperar.unTiempo(3000),
                Click.on(BTN_GUARDAR),
                Esperar.unTiempo(10000)
        );
    }
}
