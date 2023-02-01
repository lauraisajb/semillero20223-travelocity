package com.travelocity.tasks;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterfaces.OpcionesUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

public class SeleccionarOpcionesUsuario implements Question<String>{

    public static Performable seleccionInicioSesion(){

        return Task.where("",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(OpcionesUsuario.SELECT_INICIO_SESION),
                Click.on(OpcionesUsuario.SELECT_INICIO_SESION_2)
        );
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).findBy(OpcionesUsuario.SELECT_INICIO_SESION.getCssOrXPathSelector()).getText();
    }
    /*public static Performable verificarInicioSesion(String){
        return Task.where("",
                Ensure.that(this.answeredBy())
        );

    }*/


}
