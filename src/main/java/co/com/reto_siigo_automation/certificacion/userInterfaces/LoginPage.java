package co.com.reto_siigo_automation.certificacion.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.webdriver.shadow.ByShadow;


public class LoginPage {

    public static final Target TXT_USUARIO =
            Target.the("Campo ingresar usuario").located(ByShadow.cssSelector("#username-input", "#username"));
    public static final Target TXT_CLAVE =
            Target.the("Campo ingresar clave").located(ByShadow.cssSelector("#password-input","#current-password"));
    public static final Target MENSAJE_CREAR_TERCERO =
            Target.the("Mensaje crear Tercero").located(By.xpath("(//div[@class='column ng-star-inserted'])[1]"));
    public static final Target BTN_INICIAR_SESION =
            Target.the("Button ingresar").located(By.id("login-submit"));
    public static final Target BTN_ALERTA =
            Target.the("Boton alerta loading").located(By.xpath("//*[@id='loading-spinner-text']"));
    public static final Target MSG_APLICACION =
            Target.the("Mensaje de la aplicacion Principal").locatedBy("//*[contains(text(),'{0}')]");
    private LoginPage() {}
}