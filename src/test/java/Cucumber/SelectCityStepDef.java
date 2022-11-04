package Cucumber;

import ApiComponents.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class SelectCityStepDef {

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

    @Given("a user is assigned a random country")
    public void a_user_is_assigned_a_random_country() {
        // Set a country here
    }
    @When("the user selects a city")
    public void the_user_selects_a_city() {
        // pick a city from that country
    }
    @Then("the program selects the city as the battle location")
    public void the_program_selects_the_city_as_the_battle_location() {
        // check city is correct
    }
}
