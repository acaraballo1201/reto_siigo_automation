package co.com.reto_siigo_automation.certificacion.stepDefinitions.api;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonStep {

    public static void PrepararEscenario(String urlBase) {
        OnStage.setTheStage(new OnlineCast());
       theActorCalled("Andres").whoCan(CallAnApi.at(urlBase));
    }
}
