package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDestinoVuelos;
import com.travelocity.tasks.SeleccionarOrigenVuelos;
import com.travelocity.userinterfaces.VuelosEncontrados;
import io.cucumber.java.af.En;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VuelosRedondosStepDefinitions {

    @Dado("{actor} esta en {string}")
    public void viajeOrigen(Actor actor, String origen) {
        actor.attemptsTo(
                SeleccionarOrigenVuelos.para(origen)
        );
    }
    @Cuando("quiera viajar a {string} por {int} dias")
    public void viajeDestinoConDias(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelos.destinoYDias(destino, cantidadDias)
        );
    }

    @Entonces("debe obtener alguna opcion de vuelo")
    public void viajeObtenerAlgunaOpcion() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }


}
