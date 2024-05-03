package co.com.reto_siigo_automation.certificacion.interactions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.junit.Assert;

import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.CREAR_USUARIO;
import static co.com.reto_siigo_automation.certificacion.utils.apis.enums.EnumsTransversal.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConPostRegistrarUsuario implements Interaction {
    GestionarDatos Data = new GestionarDatos();

    public static ConPostRegistrarUsuario enApi() {
        return instrumented(ConPostRegistrarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to(CREAR_USUARIO.toString()).
                        with(requestSpecification ->
                                requestSpecification
                                        .contentType(ContentType.JSON)
                                        .body("{" +
                                                '\"' + EMAIL.getLlave() + '\"' + ":" + '\"' + EMAIL.getValor() + '\"' + "," +
                                                '\"' + PASSWORD.getLlave() + '\"' + ":" + '\"' + PASSWORD.getValor() + '\"' +
                                                "}"
                                        )));
        Assert.assertEquals(201, SerenityRest.lastResponse().statusCode());

    }
}
