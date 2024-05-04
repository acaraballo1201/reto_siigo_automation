package co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados;

import co.com.reto_siigo_automation.certificacion.interactions.esperas.Esperar;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import static co.com.reto_siigo_automation.certificacion.utils.web.EnumDomBtnClientes.SEARCH_CONTEXT_BTN_CLIENTES;
import static co.com.reto_siigo_automation.certificacion.utils.web.EnumDomBtnClientes.SHADOW_1_BTN_CLIENTES;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BotonClientes implements Interaction {

    @SneakyThrows
    @Step("Click en el boton Entrar")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Esperar.unTiempo(10000));
        Task.where("Este Elemento esta dentro de otro shadow root");
        Thread.sleep(1000);
        SearchContext shadow = getDriver().findElement(By.cssSelector(SEARCH_CONTEXT_BTN_CLIENTES.toString())).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector(SHADOW_1_BTN_CLIENTES.toString())).click();
        Thread.sleep(5000);


    }
}