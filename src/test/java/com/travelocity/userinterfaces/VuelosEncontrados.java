package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class VuelosEncontrados {
    public static final Target LIST_VUELOS_ENCONTRADOS = Target.the("lista vuelos encontrados").locatedBy("//ul[@data-test-id='listings']/li");
}
