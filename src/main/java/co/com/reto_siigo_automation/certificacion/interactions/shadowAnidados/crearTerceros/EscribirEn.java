package co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.crearTerceros;

import co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.BotonClientes;
import co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.BotonCrear;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscribirEn {
    private EscribirEn() {}

    public static CajaTextoCedula cajaTextoCedula() {
        return instrumented(CajaTextoCedula.class);
    }
    public static CajaTextoNombre cajaTextoNombre() {
        return instrumented(CajaTextoNombre.class);
    }
    public static CajaTextoApellido cajaTextoApellido() {
        return instrumented(CajaTextoApellido.class);
    }


}

