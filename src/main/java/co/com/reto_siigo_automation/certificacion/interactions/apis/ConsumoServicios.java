package co.com.reto_siigo_automation.certificacion.interactions.apis;

import net.serenitybdd.screenplay.Tasks;

public class ConsumoServicios {

    public static ConGetListaCompletaDeEmpleados conGetEmpleados() {
        return Tasks.instrumented(ConGetListaCompletaDeEmpleados.class);
    }

    public static ConPostCrearEmpleado conPostCrear() {
        return Tasks.instrumented(ConPostCrearEmpleado.class);
    }

    public static ConPostCrearEmpleado conPostCrearEmpleado() {
        return Tasks.instrumented(ConPostCrearEmpleado.class);
    }
    public static ConDeleteEliminarEmpleado conPostBorrarEmpleado() {
        return Tasks.instrumented(ConDeleteEliminarEmpleado.class);
    }
}
