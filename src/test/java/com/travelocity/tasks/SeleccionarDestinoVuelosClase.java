package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDestinoVuelosClase implements Task {
    private String destino;
    private Integer diasViaje;

    public SeleccionarDestinoVuelosClase(String destino, Integer diasViaje){
        this.destino = destino;
        this.diasViaje = diasViaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleVuelos.BUT_DESTINO),
                Enter.theValue(this.destino).into(DetalleVuelos.IN_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.SELECT_CLASE),
                Click.on(DetalleVuelos.SELECT_CLASE_PREMIUM),
                Click.on(DetalleVuelos.SELECT_DATE_REGRESO),
                Click.on(DetalleVuelos.DATE_REGRESO),
                Click.on(DetalleVuelos.BUT_LISTO_DATE),
                Click.on(DetalleVuelos.BUT_BUSCAR)
        );
    }

    public static Performable destinoYDiasEconomicoPremium (String destino, Integer diasViaje){
        return instrumented(SeleccionarDestinoVuelosClase.class, destino, diasViaje);
    }
}

