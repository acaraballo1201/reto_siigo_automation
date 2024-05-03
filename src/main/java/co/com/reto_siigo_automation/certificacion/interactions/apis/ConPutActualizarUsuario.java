package co.com.reto_siigo_automation.certificacion.interactions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Put;
import org.junit.Assert;

import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.ACTUALIZAR_USUARIO;
import static co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos.CREAR_USUARIO;
import static co.com.reto_siigo_automation.certificacion.utils.apis.enums.EnumsTransversal.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConPutActualizarUsuario implements Interaction {
    GestionarDatos Data = new GestionarDatos();

    public static ConPutActualizarUsuario enApi() {
        return instrumented(ConPutActualizarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Put.to(String.format(ACTUALIZAR_USUARIO.toString(),Data.obtenerDatos("empleado"))).
                        with(requestSpecification ->
                                requestSpecification
                                        .contentType(ContentType.JSON)
                                        .body("{" +
                                                '\"' + NAME.getLlave() + '\"' + ":" + '\"' + NAME.getValor() + '\"' + "," +
                                                '\"' + NEW_JOB.getLlave() + '\"' + ":" + '\"' + NEW_JOB.getValor() + '\"' +
                                                "}"
                                        )));
        Assert.assertEquals(200, SerenityRest.lastResponse().statusCode());

    }
}
