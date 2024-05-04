package co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.crearTerceros;

import co.com.reto_siigo_automation.certificacion.interactions.esperas.Esperar;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class BotonEsCedula implements Interaction {

    public static WebDriver driver;
    @SneakyThrows
    @Step("Click en el boton Crear")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Esperar.unTiempo(10000));
        Task.where("Este Elemento esta dentro de otro shadow root");
        SearchContext shadow = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > thirdparty-root:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-third-party-detail:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > app-third-party-basic-data:nth-child(1) > siigo-card-web:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > siigo-dropdownlist-web:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector(" div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(4) > span:nth-child(1)")).click();
        Thread.sleep(1000);


    }
}