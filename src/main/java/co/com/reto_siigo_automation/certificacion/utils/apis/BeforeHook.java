package co.com.reto_siigo_automation.certificacion.utils.apis;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.types.Scenario;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.apache.log4j.Logger;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BeforeHook {

    /********** Log Attribute **********/
    private static final Logger LOGGER = Logger.getLogger(BeforeHook.class);

    @Before
    public void initScenario(Scenario scenario) {
        LOGGER.info("************************************************************************************************");
        LOGGER.info("[ Start stage ] --> " + scenario.getName());
        LOGGER.info("************************************************************************************************");
    }

    public static void prepareStage(String urlBase) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Andres").whoCan(CallAnApi.at(urlBase));
    }

    @After
    public void endScenario(Scenario scenario) {
        LOGGER.info("************************************************************************************************");
        LOGGER.info("[ End of stage ] --> " + scenario.getName());
        LOGGER.info("************************************************************************************************");
    }

}
