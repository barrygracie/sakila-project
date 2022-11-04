package Cucumber;
import ApiComponents.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class RandomCountryStepDef {

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

    @Given("a user is ready to start a battle")
    public void a_user_is_ready_to_start_a_battle() {
        // setup necessary variables
    }
    @When("the user begins the battle process")
    public void the_user_begins_the_battle_process() {
        // run method to select a random country
    }
    @Then("the program returns a random country")
    public void the_program_returns_a_random_country() {
        // check there is a country sselected
    }
}
