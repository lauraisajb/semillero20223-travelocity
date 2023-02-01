package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OpcionesUsuario {
    public static final Target SELECT_INICIO_SESION = Target.the("boton inicio sesion").locatedBy("//div[@id='gc-custom-header-nav-bar-acct-menu']/button");
    public static final Target SELECT_INICIO_SESION_2 = Target.the("segundo boton de inicio sesion").locatedBy("//a[@data-stid='link-header-account-signin']");

}
