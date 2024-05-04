package co.com.reto_siigo_automation.certificacion.tasks;

import co.com.reto_siigo_automation.certificacion.interactions.esperas.Esperar;
import co.com.reto_siigo_automation.certificacion.interactions.esperas.EsperarElemento;
import co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.ClickCrear;
import co.com.reto_siigo_automation.certificacion.utils.web.RandomClassExample1;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebDriver;


import static co.com.reto_siigo_automation.certificacion.userInterfaces.LoginPage.*;
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

    public static WebDriver driver;

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(10000),
                EsperarElemento.esClickable(TXT_USUARIO),
                Enter.theValue(usuario).into(TXT_USUARIO),
                EsperarElemento.esClickable(TXT_CLAVE),
                Enter.theValue(clave).into(TXT_CLAVE),
                Click.on(BTN_INICIAR_SESION),
                Esperar.unTiempo(10000)
        );
    }
}
