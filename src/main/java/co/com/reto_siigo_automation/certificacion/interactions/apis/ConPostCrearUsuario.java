package co.com.reto_siigo_automation.certificacion.interactions.apis;

import co.com.reto_siigo_automation.certificacion.tasks.IngresarAMenu;
import co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos;
import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.junit.Assert;

import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.CREAR_EMPLEADO;
import static co.com.reto_siigo_automation.certificacion.utils.apis.enums.EnumsTransversal.JOB;
import static co.com.reto_siigo_automation.certificacion.utils.apis.enums.EnumsTransversal.NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConPostCrearUsuario implements Interaction {
    GestionarDatos Data = new GestionarDatos();

    public static ConPostCrearUsuario enApi() {
        return instrumented(ConPostCrearUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to(CREAR_EMPLEADO.toString()).
                        with(requestSpecification ->
                                requestSpecification
                                        .contentType(ContentType.JSON)
                                        .body("{" +
                                                '\"' + NAME.getLlave() + '\"' + ":" + '\"' + NAME.getValor() + '\"' + "," +
                                                '\"' + JOB.getLlave() + '\"' + ":" + '\"' + JOB.getValor() + '\"' +
                                                "}"
                                        )));
        Assert.assertEquals(201, SerenityRest.lastResponse().statusCode());

    }
}
