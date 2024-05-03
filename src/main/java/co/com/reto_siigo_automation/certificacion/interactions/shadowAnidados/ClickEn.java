package co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickEn {
    private ClickEn() {}

    public static co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.BotonCrear botonEntrar() {
        return instrumented(co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.BotonCrear.class);
    }

    public static co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.BotonClientes botonClientes() {
        return instrumented(co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.BotonClientes.class);
    }

}

