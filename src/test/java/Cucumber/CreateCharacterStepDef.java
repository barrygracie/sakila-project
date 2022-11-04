package Cucumber;

import ApiComponents.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateCharacterStepDef {

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

    String firstName;
    String secondName;

    @Given("a user wants to create their own character")
    public void a_user_wants_to_create_their_own_character() {
        firstName = "Timothy";
        secondName = "Testerino";
    }
    @When("the user inputs character info")
    public void the_user_inputs_character_info() {
        //method here to write info to a new Actor
    }
    @Then("the program stores an actor in the database")
    public void the_program_stores_an_actor_in_the_database() {
        //Check name of new actor
    }
}
