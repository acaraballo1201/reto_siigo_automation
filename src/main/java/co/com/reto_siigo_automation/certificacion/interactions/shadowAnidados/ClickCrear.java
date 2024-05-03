package co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ClickCrear implements Interaction {

  public static ClickCrear enElemento() {
    return instrumented(ClickCrear.class);
  }

  public static WebDriver driver;

  @SneakyThrows
  @Override
  public <T extends Actor> void performAs(T actor) {
    Thread.sleep(30000);
    SearchContext shadow0 = getDriver().findElement(By.cssSelector(".data-siigo-five9.hydrated")).getShadowRoot();
    Thread.sleep(1000);
    SearchContext shadow1 = shadow0.findElement(By.cssSelector("siigo-button-atom[type='button'][class='hydrated'][color='primary-green']")).getShadowRoot();
    Thread.sleep(1000);
    shadow1.findElement(By.cssSelector(".btn-element.size-m")).click();
    Thread.sleep(5000);

  }
}
