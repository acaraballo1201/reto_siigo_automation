package co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados;

import co.com.reto_siigo_automation.certificacion.interactions.esperas.Esperar;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BotonClientes implements Interaction {

    @SneakyThrows
    @Step("Click en el boton Entrar")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Esperar.unTiempo(10000));
        //This Element is inside single shadow DOM.
        Thread.sleep(1000);
        SearchContext shadow = getDriver().findElement(By.cssSelector(".data-siigo-five9.hydrated")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector(" div:nth-child(1) > header:nth-child(3) > nav:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(5) > siigo-header-create-button-dropdown:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > li:nth-child(2) > div:nth-child(1) > a:nth-child(2)")).click();
        Thread.sleep(5000);


    }
}