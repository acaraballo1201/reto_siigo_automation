package com.reto_siigo_automation.certificacion.tasks.autenticacion;

import com.reto_siigo_automation.certificacion.interactions.AbrirNavegador;
import com.reto_siigo_automation.certificacion.interactions.esperas.Esperar;
import com.reto_siigo_automation.certificacion.interactions.esperas.EsperarCarga;
import com.reto_siigo_automation.certificacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.reto_siigo_automation.certificacion.userInterfaces.auntenticacion.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static IniciarSesion enSiigo(String usuario, String clave) {
        return instrumented(IniciarSesion.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AbrirNavegador.enSiigo(),
                EsperarElemento.esClickable(TXT_USUARIO),
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Click.on(BTN_INICIAR_SESION),
                EsperarCarga.desaparezca());
    }
}
