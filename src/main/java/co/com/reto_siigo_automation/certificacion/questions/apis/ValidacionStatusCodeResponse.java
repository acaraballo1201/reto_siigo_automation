package co.com.reto_siigo_automation.certificacion.questions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.junit.Assert;

import static co.com.reto_siigo_automation.certificacion.utils.apis.enums.EnumsRutasjson.CAMPO_BODY;
import static org.hamcrest.MatcherAssert.assertThat;

public class ValidacionStatusCodeResponse implements Question<Boolean> {

    GestionarDatos Data = new GestionarDatos();

    private final int statusCode;
    private boolean statusCodeResponse = true;

    public ValidacionStatusCodeResponse(int statusCode) {
        this.statusCode = statusCode;
    }

    public static ValidacionStatusCodeResponse is(int statusCode) {
        return new ValidacionStatusCodeResponse(statusCode);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Assert.assertEquals(statusCode, SerenityRest.lastResponse().statusCode());
        return statusCodeResponse;
    }

}
