package co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.crearTerceros;

import co.com.reto_siigo_automation.certificacion.interactions.esperas.Esperar;
import co.com.reto_siigo_automation.certificacion.utils.web.enums.NumeroRandom;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CajaTextoCedula implements Interaction {

    @SneakyThrows
    @Step("Caja De Texto para ingresar Cedula")
    @Override
    public <T extends Actor> void performAs(T actor) {
        String nroCedulaRandom = String.valueOf(NumeroRandom.deOchoDigitos());
        actor.attemptsTo(Esperar.unTiempo(10000));
        Task.where("Este Elemento esta dentro de otro shadow root");
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "siigo-identification-input-web[class='hydrated']";
        Thread.sleep(1000);
        SearchContext shadow = getDriver().findElement(By.cssSelector("siigo-identification-input-web[class='hydrated']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector(".mdc-text-field__input.input-identification")).sendKeys("12345678");
        Thread.sleep(5000);


    }
}