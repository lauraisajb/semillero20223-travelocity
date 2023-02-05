package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleHospedaje;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarHospedajeConHabitacion implements Task {
    private String destinoHospedaje;
    private Integer diasHospedaje;

    public SeleccionarHospedajeConHabitacion(String destinoHospedaje, Integer diasHospedaje){
        this.destinoHospedaje = destinoHospedaje;
        this.diasHospedaje = diasHospedaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleHospedaje.BUT_DESTINO),
                Enter.theValue(this.destinoHospedaje).into(DetalleHospedaje.IN_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleHospedaje.SELECT_DATE_SALIDA),
                Click.on(DetalleHospedaje.DATE_SALIDA),
                Click.on(DetalleHospedaje.DATE_REGRESO),
                Click.on(DetalleHospedaje.BUT_LISTO_DATE),
                Click.on(DetalleHospedaje.SELECT_PERSONAS),
                Click.on(DetalleHospedaje.BUT_HABITACION),
                Click.on(DetalleHospedaje.BUT_LISTO_HABITACION),
                Click.on(DetalleHospedaje.BUT_BUSCAR)
        );
    }

    public static Performable destinoYDiasReservaHospedaje (String destinoHospedaje, Integer diasHospedaje){
        return instrumented(SeleccionarHospedajeConHabitacion.class, destinoHospedaje, diasHospedaje);
    }

}
