package co.com.reto_siigo_automation.certificacion.interactions;

import co.com.reto_siigo_automation.certificacion.interactions.shadowAnidados.ClickEn;
import co.com.reto_siigo_automation.certificacion.interactions.transversales.AbrirNavegador;
import co.com.reto_siigo_automation.certificacion.tasks.IniciarSesion;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AutenticacionPoo implements Interaction {

  public final String user;
  public final String pass;

  public AutenticacionPoo(String user, String pass) {
    this.user = user;
    this.pass = pass;
  }

  public static AutenticacionPoo enSiigo(String user, String pass) {
    return instrumented(AutenticacionPoo.class, user, pass);
  }

  @SneakyThrows
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(AbrirNavegador.enSiigo(),
            IniciarSesion.enSiigo(user,pass));
  }
}
