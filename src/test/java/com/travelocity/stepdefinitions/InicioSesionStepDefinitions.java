package com.travelocity.stepdefinitions;

import com.travelocity.tasks.LlenarFormularioInicioSesion;
import com.travelocity.tasks.SeleccionarOpcionesUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class InicioSesionStepDefinitions {

    @Dado("que {actor} accedera a su cuenta en travelocity")
    public void queElUsuarioAccederaASuCuentaEnTravelocity(Actor actor) {
        actor.attemptsTo(
                SeleccionarOpcionesUsuario.seleccionInicioSesion()
        );
    }
    @Cuando("ingresa su informacion de acceso  {string} y contrasena {string}")
    public void ingresaSuInformacionDeAccesoYContrasena( String email, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LlenarFormularioInicioSesion.emailypassword(email, password)
        );
    }
    @Entonces("debe verse el nombre de {string}")
    public void debeVerseElNombreDe(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
