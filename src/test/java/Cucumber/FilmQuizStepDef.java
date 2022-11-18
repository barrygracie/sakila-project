package Cucumber;
import ApiComponents.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class FilmQuizStepDef {

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

    List<Film> result;

    boolean filmQuiz;


    @Given("User playing film quiz")
    public void user_playing_film_quiz() {
        filmQuiz=true;
    }
    @When("the film quiz is being generated")
    public void the_film_quiz_is_being_generated() {
        result = app.getRandom4Films();
    }
    @Then("the program returns four random films")
    public void the_program_returns_four_random_films() {
        int length = result.size();
        Film check = result.get(0);

        Assertions.assertTrue(length==4);
        Assertions.assertTrue(check instanceof Film);
    }
}
