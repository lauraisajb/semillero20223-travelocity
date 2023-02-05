package com.travelocity.tasks;

import com.travelocity.userinterfaces.CamposInicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFormularioInicioSesion implements Task {
        private String email;
        private String password;

    public LlenarFormularioInicioSesion(String email, String password){
            this.email = email;
            this.password = password;
        }

        @Override
        public <T extends Actor > void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(CamposInicioSesion.EMAIL_INICIO_SESION),
                    Enter.theValue(this.email).into(CamposInicioSesion.EMAIL_INICIO_SESION),
                    Click.on(CamposInicioSesion.PASSWORD_INICIO_SESION),
                    Enter.theValue(this.password).into(CamposInicioSesion.PASSWORD_INICIO_SESION),
                    Click.on(CamposInicioSesion.BUT_SESION_ABIERTA),
                    Click.on(CamposInicioSesion.BUT_INICIO_SESION)
            );
        }

        public static Performable emailypassword (String email, String password){
            return instrumented(LlenarFormularioInicioSesion.class, email, password);
        }
}
