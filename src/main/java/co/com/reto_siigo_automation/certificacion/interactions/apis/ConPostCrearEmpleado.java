package co.com.reto_siigo_automation.certificacion.interactions.apis;

import co.com.reto_siigo_automation.certificacion.utils.apis.ConcatenarMetodos;
import co.com.reto_siigo_automation.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class ConPostCrearEmpleado implements Interaction {
    GestionarDatos Data = new GestionarDatos();

    public ConPostCrearEmpleado() {}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(ConcatenarMetodos.CREAR_EMPLEADO.toString())
                .with(requestSpecification -> requestSpecification));

    }
}
