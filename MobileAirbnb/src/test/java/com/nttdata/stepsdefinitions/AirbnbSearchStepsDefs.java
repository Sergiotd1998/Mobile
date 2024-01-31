package com.nttdata.stepsdefinitions;

import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;
    @Steps
    SearchDetailsScreen searchDetailsScreen;

    @Given("que me enuentro en el login de Airbnb")
    public void que_me_enuentro_en_el_login_de_airbnb() {
        airbnbSearchSteps.clickClose();
    }
    @When("busco {string}")
    public void busco(String place) {
        airbnbSearchSteps.searchByText(place);
        searchDetailsScreen.enterSearchInput(place);
    }
    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text) {

        Assert.assertEquals(airbnbSearchSteps.getResultText(), text);
    }

    @And("presiono el boton skip")
    public void presionoElBotonSkip() {
        airbnbSearchSteps.clickSkip();
    }
}
