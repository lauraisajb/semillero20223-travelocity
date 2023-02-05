package com.travelocity.stepdefinitions;

import com.travelocity.tasks.*;
import com.travelocity.userinterfaces.VuelosEncontrados;
import io.cucumber.java.af.En;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

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
    @Cuando("quiera viajar a {string} por {int} dias agregando un auto")
    public void quieraViajarACancunAgregandoUnAuto(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelosConAuto.destinoYDiasVuelosConAuto(destino,cantidadDias)
        );
    }
    @Entonces("debe obtener alguna opcion de auto")
    public void debeObtenerAlgunaOpcionDeAuto() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values()
                .hasSizeGreaterThan(0);
    }

    @Cuando("quiera viajar a {string} agregando un hospedaje por {int} dias")
    public void viajeConHospedaje(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVueloConHospedaje.destinoYDiasConHospedaje(destino, cantidadDias)
        );
    }
    @Entonces("debe obtener alguna opcion de vuelo y de hospedaje")
    public void viajeOpcionDeHospedaje() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);

    }


}
