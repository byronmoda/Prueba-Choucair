package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.Join;
import co.com.choucair.certification.pruebatecnica.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

    public class UtestStepDefinitions {

        @Before
            public void setStage(){
                OnStage.setTheStage(new OnlineCast());
            }

        @Given("^than byron wants to register at the Utest$")
            public void thanByronWantsToRegisterAtTheUtest() {
                OnStage.theActorCalled("byron").wasAbleTo(OpenUp.thepage());
            }

        @When("^select button join and fill the data$")
            public void selectButtonJoinAndFillTheData() {
                OnStage.theActorCalled("byron").attemptsTo(Join.onThePage());
            }

        @Then("^check the register (.*)$")
            public void checkTheRegister(String expectedText) throws Exception {
                theActorInTheSpotlight().should(seeThat(Answer.toThe(), (equalTo(expectedText))));
            }
    }