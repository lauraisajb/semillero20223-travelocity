package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CamposInicioSesion {
    public static final Target EMAIL_INICIO_SESION = Target.the("Campo email inicio sesion").locatedBy("//input[@name='email']");
    public static final Target PASSWORD_INICIO_SESION = Target.the("Campo password inicio sesion").locatedBy("//input[@name='password']");
    public static final Target BUT_SESION_ABIERTA = Target.the("Mantener sesion abierta").locatedBy("//input[@name='rememberMe']");
    public static final Target BUT_INICIO_SESION = Target.the("Button de iniciar sesion").locatedBy("//button[@id='loginFormSubmitButton']");

}
