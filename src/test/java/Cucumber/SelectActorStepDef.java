package Cucumber;

import ApiComponents.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import static java.util.Objects.isNull;


@ScenarioScope
public class SelectActorStepDef {

    boolean gameOn;
    @Autowired
    private ActorRepository actorRepo;

    @Autowired
    private CityRepository cityRepo;

    @Autowired
    private CountryRepository countryRepo;

    @Autowired
    private FilmRepository filmRepo;

    @Autowired
    private CategoryRepository catRepo;

    @Autowired
    SakilaMicroserviceApplication app = new SakilaMicroserviceApplication(actorRepo, filmRepo,cityRepo,countryRepo,catRepo);

    Actor testActor;

    @Given("a user is playing the game")
    public void a_user_is_playing_the_game() {
        gameOn = true;
    }
    @When("the user is starting the game")
    public void the_user_is_starting_the_game() {
        testActor = app.selectActor();
    }
    @Then("the program returns a random actor")
    public void the_program_returns_a_random_actor() {
        Assertions.assertEquals(false, isNull(testActor), "no actor");
    }
}
