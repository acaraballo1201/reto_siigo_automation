package co.com.reto_siigo_automation.certificacion.questions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ValidacionStatusCodeResponse implements Question<Boolean> {

    GestionarDatos Data = new GestionarDatos();

    private final String statusCode;
    private boolean statusCodeResponse = true;

    public ValidacionStatusCodeResponse(String statusCode) {
        this.statusCode = statusCode;
    }

    public static ValidacionStatusCodeResponse is(String statusCode) {
        return new ValidacionStatusCodeResponse(statusCode);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        assertThat(Data.obtenerDatos("statusCode"),equalTo(statusCode));
        return statusCodeResponse;
    }

}
