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

public class CajaTextoApellido implements Interaction {

    @SneakyThrows
    @Step("Caja De Texto para ingresar Cedula")
    @Override
    public <T extends Actor> void performAs(T actor) {
        String nroCedulaRandom = String.valueOf(NumeroRandom.deOchoDigitos());
        actor.attemptsTo(Esperar.unTiempo(10000));
        Task.where("Este Elemento esta dentro de otro shadow root");
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > thirdparty-root:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-third-party-detail:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > app-third-party-basic-data:nth-child(1) > siigo-card-web:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > siigo-textfield-web:nth-child(1)";
        Thread.sleep(1000);
        SearchContext shadow = getDriver().findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > thirdparty-root:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-third-party-detail:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > app-third-party-basic-data:nth-child(1) > siigo-card-web:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > siigo-textfield-web:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#s20d1649-a46f-4932-8cec-b3d3072d0a55")).sendKeys("Apellido_bot");
        Thread.sleep(5000);
        Thread.sleep(5000);


    }
}