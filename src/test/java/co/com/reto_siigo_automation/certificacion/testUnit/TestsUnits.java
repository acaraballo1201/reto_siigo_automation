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
}
