package co.com.reto_siigo_automation.certificacion.tasks.metodos;


import java.util.logging.Level;
import java.util.logging.Logger;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.junit.Assert;

import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.LISTA_COMPLETA_DE_EMPLEADOS;

public class CrearAutenticacion implements Task {

  private static final Logger LOGGER = Logger.getLogger(CrearAutenticacion.class.getName());

  public static Performable paraOutlook() {
    return Tasks.instrumented(CrearAutenticacion.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Get.resource(String.format(LISTA_COMPLETA_DE_EMPLEADOS.toString()))
            .with(requestSpecification -> requestSpecification
            ));

    Assert.assertEquals(200, SerenityRest.lastResponse().statusCode());
    String accessToken =String.valueOf(SerenityRest.lastResponse().jsonPath().getString("access_token"));
    LOGGER.log(Level.INFO, (accessToken));
  }
  }