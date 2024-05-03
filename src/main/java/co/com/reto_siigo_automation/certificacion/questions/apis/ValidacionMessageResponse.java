package co.com.reto_siigo_automation.certificacion.questions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ValidacionMessageResponse implements Question<Boolean> {

    GestionarDatos Data = new GestionarDatos();

    private final String message;
    private boolean messageResponse = true;

    public ValidacionMessageResponse(String message) {
        this.message = message;
    }

    public static ValidacionMessageResponse is(String message) {
        return new ValidacionMessageResponse(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        assertThat(Data.obtenerDatos("message"),equalTo(message));
        return messageResponse;
    }

}
