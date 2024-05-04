package co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados;

import co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.crearTerceros.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickEn {
    private ClickEn() {}

    public static BotonCrear botonEntrar() {
        return instrumented(BotonCrear.class);
    }

    public static BotonClientes botonClientes() {
        return instrumented(BotonClientes.class);
    }
    public static BotonTipoDePersona botonTipoDePersona() {
        return instrumented(BotonTipoDePersona.class);
    }
    public static BotonEsPersona botonEsPersona() {
        return instrumented(BotonEsPersona.class);
    }
    public static BotonTipoDeIdentificacion botonTipoDeIdentificacion() {
        return instrumented(BotonTipoDeIdentificacion.class);
    }
    public static BotonEsCedula botonEsCedula() {
        return instrumented(BotonEsCedula.class);
    }

}

