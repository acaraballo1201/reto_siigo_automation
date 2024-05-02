package com.reto_siigo_automation.certificacion.userInterfaces.auntenticacion;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class LoginPage {
    public static final Target TXT_USUARIO =
            Target.the("Login Input").located(By.id("username-input"));
    public static final Target TXT_CLAVE =
            Target.the("Password Input").located(By.id("password-input"));
    public static final Target BTN_INICIAR_SESION =
            Target.the("Button Login").located(By.id("login-submit"));
    public static final Target BTN_ALERTA =
            Target.the("Boton alerta").located(By.xpath("//*[@id='loading-spinner-text']"));
    public static final Target MSG_APLICACION =
            Target.the("Mensaje de la aplicacion Principal").locatedBy("//*[contains(text(),'{0}')]");
    public static final Target BTN_CREAR =
            Target.the("Boton crear desde pantalla home").located(ByShadow.cssSelector("#wc-s1a6dc5b-f10b-42ca-88c7-2963abec49f3 > div > button", "#wc-s718d55d-39a5-44a3-9165-9305e980b75f > header > nav > div > div:nth-child(2) > ul > li:nth-child(5) > siigo-button-atom","#layout-navbar > header-root > generalheader > siigo-header-molecule"));

    private LoginPage() {}
}