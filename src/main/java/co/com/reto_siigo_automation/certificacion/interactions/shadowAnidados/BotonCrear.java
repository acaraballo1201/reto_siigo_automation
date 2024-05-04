package co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados;

import co.com.reto_siigo_automation.certificacion.interactions.esperas.Esperar;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import static co.com.reto_siigo_automation.certificacion.utils.web.EnumDomBtnCrear.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BotonCrear implements Interaction {

    @SneakyThrows
    @Step("Click en el boton Crear")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Esperar.unTiempo(10000));
        Task.where("Este Elemento esta dentro de otro shadow root");
        SearchContext shadow0 = getDriver().findElement(By.cssSelector(SHADOW_0_BTN_CREAR.toString())).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(SEARCH_CONTEXT_BTN_CREAR.toString())).getShadowRoot();
        Thread.sleep(1000);
        shadow1.findElement(By.cssSelector(SHADOW_1_BTN_CREAR.toString())).click();
        Thread.sleep(5000);


    }
}