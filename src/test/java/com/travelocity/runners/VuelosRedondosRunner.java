package com.travelocity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/vuelos/vuelos_redondos.feature",
        glue = {"com.travelocity.stepdefinitions"}
)
public class VuelosRedondosRunner {}
