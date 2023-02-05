package com.travelocity.stepdefinitions;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.tasks.SeleccionarHospedajeConHabitacion;
import com.travelocity.tasks.SeleccionarHospedajes;
import com.travelocity.userinterfaces.HospedajesEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ReservaHospedajeStepDefinitions {
    @Dado("{actor} se encuentra en la opcion hospedaje")
    public void queMeEncuentroEnLaOpcionHospedaje(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(TravelocityHomePage.class)
        );

    }
    @Cuando("quiere reservar un hotel a {string} por {int} dias")
    public void quieroReservarUnHotelACartagenaPorDias(String destino, Integer dias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarHospedajes.destinoYDiasReservaHospedaje(destino, dias)
        );
    }

    @Cuando("quiere reservar un hotel a {string} por {int} dias agregando otra habitacion")
    public void ReservarUnHotelACartagenaPorDiasAgregandoOtraHabitacion(String destinoHospedaje, Integer cantidadDiasHospedaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarHospedajeConHabitacion.destinoYDiasReservaHospedaje(destinoHospedaje, cantidadDiasHospedaje)
        );
    }
    @Entonces("debe obtener al menos una opcion de hospedaje")
    public void AlMenosUnaOpcionDeHospedaje() {
        Ensure.that(HospedajesEncontrados.LIST_HOSPEDAJES_ENCONTRADOS).values().hasSizeGreaterThan(0);

    }
}
