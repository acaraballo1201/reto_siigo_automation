package co.com.reto_siigo_automation.certificacion.interactions.apis;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.junit.Assert;

import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.REGISTRAR_USUARIO;
import static co.com.reto_siigo_automation.certificacion.utils.apis.enums.EnumsTransversal.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConPostRegistrarUsuario implements Interaction {

    public static ConPostRegistrarUsuario enApi() {
        return instrumented(ConPostRegistrarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to(REGISTRAR_USUARIO.toString()).
                        with(requestSpecification ->
                                requestSpecification
                                        .contentType(ContentType.JSON)
                                        .body("{" +
                                                '\"' + EMAIL.getLlave() + '\"' + ":" + '\"' + EMAIL.getValor() + '\"' + "," +
                                                '\"' + PASSWORD.getLlave() + '\"' + ":" + '\"' + PASSWORD.getValor() + '\"' +
                                                "}"
                                        )));
        Assert.assertEquals(200, SerenityRest.lastResponse().statusCode());

    }
}
