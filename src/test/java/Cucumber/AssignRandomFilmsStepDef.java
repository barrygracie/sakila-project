package Cucumber;

import ApiComponents.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class AssignRandomFilmsStepDef {

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

    @Given("a user has created a character")
    public void a_user_has_created_a_character() {
        //method to write a new character
    }
    @When("the user proceeds")
    public void the_user_proceeds() {
        //Call random films method
    }
    @Then("the program selects {int} random films and stores them in the database")
    public void the_program_selects_random_films_and_stores_them_in_the_database() {
        // check the films are on the actors record
    }
}
