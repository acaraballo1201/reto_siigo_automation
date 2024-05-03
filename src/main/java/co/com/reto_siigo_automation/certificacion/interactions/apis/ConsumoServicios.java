package co.com.reto_siigo_automation.certificacion.interactions.apis;

import net.serenitybdd.screenplay.Tasks;

public class ConsumoServicios {



    public static ConPostCrearUsuario conPostCrear() {
        return Tasks.instrumented(ConPostCrearUsuario.class);
    }

    public static ConPostCrearUsuario conPostCrearEmpleado() {
        return Tasks.instrumented(ConPostCrearUsuario.class);
    }
    public static ConDeleteEliminarEmpleado conPostBorrarEmpleado() {
        return Tasks.instrumented(ConDeleteEliminarEmpleado.class);
    }
}
