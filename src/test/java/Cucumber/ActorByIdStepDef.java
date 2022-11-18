package Cucumber;
import ApiComponents.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ActorByIdStepDef {

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

    int id;

    Actor test;

    @Given("User wants to find an actor by id")
    public void user_wants_to_find_an_actor_by_id() {
       id=7;
    }
    @When("the user searches for an actor by id")
    public void the_user_searches_for_an_actor_by_id() {
        test = app.getActorById(id).getBody();
    }
    @Then("the program returns the correct actor")
    public void the_program_returns_the_correct_actor() {
        Assertions.assertEquals("GRACE",test.getActorFirstName(),"not getting actor");
    }


}
