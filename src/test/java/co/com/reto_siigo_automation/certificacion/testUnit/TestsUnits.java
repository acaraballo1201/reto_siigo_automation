package co.com.reto_siigo_automation.certificacion.testUnit;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestsUnits {


  String uriAccessToken = "https://login.microsoftonline.com";
  String pathCreateAccessToken = "/common/oauth2/v2.0/token";
  String uri = "https://graph.microsoft.com/v1.0";
  String pathListMessages = "/me/messages";
  String pathOnlyMessage = "/me/messages";

  private static final Logger LOGGER = LoggerFactory.getLogger(TestsUnits.class);
  Response response;

  @Test
  public void testGetUsers() {
    baseURI = "https://reqres.in/api";
    given()
        .when()
        .get("/users")
        .then()
        .statusCode(200)
        .body("data[1].first_name", equalTo("Janet"));
  }


  @Test
  public void testPostUser() {
    baseURI = "https://reqres.in/api";
    Map<String, Object> map = new HashMap<>();
    map.put("name", "Alejandra");
    map.put("job", "Costumer Success");

    given()
        .log()
        .all()
        .body(map.toString())
        .when()
        .post("/users")
        .then()
        .log()
        .all()
        .statusCode(201);
  }

  @Test
  public void testPostUserValidationSchema() {
    baseURI = "https://reqres.in/api";
    Map<String, Object> map = new HashMap<>();
    map.put("name", "Alejandra");
    map.put("job", "Costumer Success");

    given()
        .log()
        .all()
        .body(map.toString())
        .when()
        .post("/users")
        .then()
        .log()
        .all()
        .statusCode(201);
  }

  @Test
  public void testCrearTokenSesion() {
    baseURI = "https://tigoid-api-qa.tigocloud.net";
    String body = "";
    try {
      body =
          new String(
              Files.readAllBytes(
                  Paths.get("src/test/resources/jsonFiles/autenticacion/responseMunicipios.json")));
    } catch (IOException e) {
      LOGGER.info("envio de Body de post");
    }

    SerenityRest.given()
        .baseUri(baseURI)
        .body(body)
        .headers("x-api-key", "0UHRo1x4Ez2QU7szXNrKH6FPsZqTnsW77Yz8byRv")
        .when()
        .post("/dar/v4/public/auth/login")
        .then()
        .log()
        .all()
        .statusCode(200);
    String idToken =
        String.valueOf(
            SerenityRest.lastResponse().jsonPath().getString("RUTA_ACCESS_TOKEN.toString()"));
    LOGGER.info("El token es: " + idToken);
  }

  @Test
  public void obtenerHoraAndSegundos() {

    // milisegundos iniciales
    long miliSegundosIniciales = System.currentTimeMillis();
    LOGGER.info(String.valueOf(miliSegundosIniciales));

    // milisegundos finales
    long miliSegundosFinales = System.currentTimeMillis();
    LOGGER.info(String.valueOf(miliSegundosFinales));

    // Operacion aritmetica diferencia de milisegundos
    double tiempoDeEjecucion =
        Double.parseDouble(String.valueOf((miliSegundosFinales - miliSegundosIniciales)));

    // Conversion a segundos
    double formatoASegundos = (tiempoDeEjecucion / 1000);
    //        double formatoASegundos = 4001;

    // Impresion de resultado
    LOGGER.info(String.valueOf(tiempoDeEjecucion));
    LOGGER.info(String.valueOf(formatoASegundos));

    // Validacion de tiempo
    if (formatoASegundos <= 4000) {
      LOGGER.info("La API cumple con el tiempo de ejecucion Esperado: " + formatoASegundos);
    } else if (formatoASegundos > 4000) {
      LOGGER.info(
          "La API NO cumple con el tiempo de ejecucion Esperado: " + formatoASegundos);
    }
  }

  @Test
  public void crearOtp() {
    baseURI = "https://test.id.tigo.com";
    given()
        .baseUri(baseURI)
        .headers("apikey", "An7VxwzVYPldilMUdT8Woq1rMiBDwOfF")
        .get("/openid/phone/otp/mastercode")
        .then()
        .log()
        .all()
        .statusCode(200);
    SerenityRest.lastResponse().jsonPath().getString("PATH_SUBJECT_LAST_MSG.toString()");
  }

  @Test
  public void testGetUsersValidationSchema() {
    baseURI = "https://reqres.in/api";
    given().when().get("/users").then().statusCode(200);
  }

}
