package Cucumber;
import ApiComponents.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CountryQuizStepDef {

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

    List<Country> result;
    boolean countryQuiz;



    @Given("User playing country quiz")
    public void user_playing_country_quiz() {
        countryQuiz=true;

    }
    @When("the quiz is being generated")
    public void the_quiz_is_being_generated() {
        result = app.getRandomCountry();

    }
    @Then("the program returns four random countries")
    public void the_program_returns_four_random_countries() {
        int length = result.size();
        Country check = result.get(0);

        Assertions.assertTrue(length==4);
        Assertions.assertTrue(check instanceof Country);

    }
}
