package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDestinoConHospedaje;
import com.travelocity.tasks.SeleccionarDestinoVuelos;
import com.travelocity.tasks.SeleccionarDestinoVuelosClase;
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

    @Cuando("quiera viajar a {string} en clase economica premium por {int} dias")
    public void viajeClaseEconmicaPremiumConDias(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelosClase.destinoYDiasEconomicoPremium(destino, cantidadDias)
        );
    }
    @Entonces("debe obtener al menos una opcion de viaje")
    public void debe_obtener_al_menos_una_opcion_de_viaje() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Cuando("quiera viajar a {string} agregando un hospedaje por {int} dias")
    public void viajeConHospedaje(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoConHospedaje.destinoYDiasConHospedaje(destino, cantidadDias)
        );
    }
    @Entonces("debe obtener alguna opcion de hospedaje")
    public void viajeOpcionDeHospedaje() {

    }


}
