package ApiComponents.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResourceAccessException;


@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class SakilaMicroserviceApplication {

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

	public SakilaMicroserviceApplication(ActorRepository actorRepo, FilmRepository filmRepo, CityRepository cityRepo, CountryRepository countryRepo, CategoryRepository catRepo){
		this.actorRepo = actorRepo;
		this.filmRepo = filmRepo;
		this.cityRepo = cityRepo;
		this.countryRepo = countryRepo;
		this.catRepo = catRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaMicroserviceApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepo.findAll();
	}

	@GetMapping("/actors/{id}")
	public ResponseEntity<Actor> getActorById(@PathVariable(value = "id") int actorId)
			throws ResourceAccessException {
		Actor actor = actorRepo.findById(actorId)
				.orElseThrow(() -> new ResourceAccessException("Actor not found for this id: " + actorId));
		return ResponseEntity.ok().body(actor);
	}

	@PutMapping("/actors/{id}")
	public ResponseEntity<Actor> updateActor(@PathVariable int id,@RequestBody Actor actorDetails) {
		Actor updateActor = actorRepo.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Actor doesn't exist with id: " + id));

		updateActor.setActorFirstName(actorDetails.getActorFirstName());
		updateActor.setActorLastName(actorDetails.getActorLastName());

		actorRepo.save(updateActor);

		return ResponseEntity.ok(updateActor);
	}

	@PostMapping("/actors")
	public ResponseEntity<Actor> saveActor(@RequestBody Actor actorDetails) {

		try {
			return new ResponseEntity<>(actorRepo.save(actorDetails), HttpStatus.CREATED);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/actors/{id}")
	public ResponseEntity<HttpStatus> deleteActor(@PathVariable int id) {
		try {
			Actor deleteActor = actorRepo.findById(id)
					.orElseThrow(() -> new ResourceAccessException("Actor doesn't exist with id: " + id));

			actorRepo.delete(deleteActor);

			return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
		}
		catch (Exception e)
		{
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepo.findAll();
	}


	//change this to first name or surname
	@GetMapping("/films/{id}")
	public ResponseEntity<Film> getFilmById(@PathVariable(value = "id") int filmId)
			throws ResourceAccessException {
		Film film = filmRepo.findById(filmId)
				.orElseThrow(() -> new ResourceAccessException("Film not found for this id: " + filmId));
		return ResponseEntity.ok().body(film);
	}

	@GetMapping("/allCity")
	public @ResponseBody
	Iterable<City> getAllCity(){
		return cityRepo.findAll();
	}

	@GetMapping("/city/{id}")
	public ResponseEntity<City> getCityById(@PathVariable(value = "id") int cityId)
			throws ResourceAccessException {
		City city = cityRepo.findById(cityId)
				.orElseThrow(() -> new ResourceAccessException("City not found for this id: " + cityId));
		return ResponseEntity.ok().body(city);
	}

	@GetMapping("/allCategories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){
		return catRepo.findAll();
	}

	@GetMapping("/allCountries")
	public @ResponseBody
	Iterable<Country> getAllCountries(){
		return countryRepo.findAll();
	}

	@GetMapping("/random4Films")
	public @ResponseBody
	Iterable<Film> getRandom4Films() { return filmRepo.getRandom4Films();}

	@GetMapping("/randomFilm")
	public @ResponseBody
	Film getRandomFilm() { return filmRepo.getRandomFilm();}

	@GetMapping("/randomCountry")
	public @ResponseBody
	Iterable<Country> getRandomCountry() { return countryRepo.getRandomCountry();}

	@GetMapping("/randomCity/{id}")
	public @ResponseBody
	City selectCity(@PathVariable(value = "id") int countryId){return cityRepo.selectCityFromCountry(countryId);}

	@GetMapping("/randomCity")
	public @ResponseBody
	City getRandomCity() { return cityRepo.getOneRandomCity();}

	@GetMapping("/selectActor")
	public @ResponseBody
	Actor selectActor(){return actorRepo.selectActor();}



}
