package com.travelocity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/autenticacion/sesion_en_travelocity.feature",
        glue = {"com.travelocity.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SesionEnTravelocityRunner {
}
