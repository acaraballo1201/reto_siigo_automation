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

import static co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.ClickCrear.driver;
import static co.com.reto_siigo_automation.certificacion.utils.web.enums.EnumDomBtnCrear.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BotonTipoDePersona implements Interaction {

    @SneakyThrows
    @Step("Click en la opcion tipo de Persona")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Esperar.unTiempo(10000));
        Task.where("Este Elemento esta dentro de otro shadow root");
        SearchContext shadow = getDriver().findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > thirdparty-root:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-third-party-detail:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > app-third-party-basic-data:nth-child(1) > siigo-card-web:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > siigo-dropdownlist-web:nth-child(1)")).getShadowRoot();
        Thread.sleep(2000);
        shadow.findElement(By.cssSelector(".mdc-select__anchor.mdc-ripple-upgraded.mdc-ripple-upgraded--foreground-activation")).click();
        Thread.sleep(5000);


    }
}