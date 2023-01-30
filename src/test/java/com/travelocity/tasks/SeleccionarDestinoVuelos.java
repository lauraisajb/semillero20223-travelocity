package com.travelocity.tasks;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterfaces.DetalleVuelos;
import com.travelocity.userinterfaces.MenuTravelocity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDestinoVuelos implements Task {
    private String destino;
    private Integer diasViaje;

    public SeleccionarDestinoVuelos(String destino, Integer diasViaje){
        this.destino = destino;
        this.diasViaje = diasViaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(DetalleVuelos.BUT_DESTINO),
            Enter.theValue(this.destino).into(DetalleVuelos.IN_DESTINO).thenHit(Keys.ENTER),
            Click.on(DetalleVuelos.SELECT_DATE_REGRESO),
            Click.on(DetalleVuelos.DATE_REGRESO),
            Click.on(DetalleVuelos.BUT_LISTO_DATE),
            Click.on(DetalleVuelos.BUT_BUSCAR)
        );
    }

    public static Performable destinoYDias (String destino, Integer diasViaje){
        return instrumented(SeleccionarDestinoVuelos.class, destino, diasViaje);
    }
}
