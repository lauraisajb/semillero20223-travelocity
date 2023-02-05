package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleHospedaje {
    public static final Target BUT_DESTINO = Target.the("button de destino").locatedBy("//button[@data-stid='location-field-destination-menu-trigger']");
    public static final Target IN_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-destination']");
    public static final Target SELECT_DATE_SALIDA = Target.the("selector de fecha salida").locatedBy("//button[@id='d1-btn']");
    public static final Target DATE_SALIDA = Target.the("calendar fecha regreso").locatedByFirstMatching("//button[@data-day='14']");
    public static final Target DATE_REGRESO = Target.the("calendar fecha regreso").locatedByFirstMatching("//button[@data-day='21']");
    public static final Target BUT_LISTO_DATE = Target.the("boton listo date vuelos").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target SELECT_PERSONAS = Target.the("button personas").locatedBy("//button[@data-testid='travelers-field-trigger']");
    public static final Target BUT_HABITACION =Target.the("button agregar habitacion").locatedBy("//button[@data-testid='add-room-button']");
    public static final Target BUT_LISTO_HABITACION = Target.the("button listo agregar habitacion hospedaje").locatedBy("//button[@data-testid='guests-done-button']");
    public static final Target BUT_BUSCAR =Target.the("button buscar hospedaje").locatedBy("//button[@data-testid='submit-button']");


}
