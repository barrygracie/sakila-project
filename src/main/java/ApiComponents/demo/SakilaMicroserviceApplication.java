package ApiComponents.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResourceAccessException;


import java.util.Collection;
import java.util.Optional;
import java.util.Set;

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
	private FilmActorRepository filmActorRepo;



	public SakilaMicroserviceApplication(ActorRepository actorRepo, FilmRepository filmRepo, CityRepository cityRepo, FilmActorRepository filmActorRepo, CountryRepository countryRepo){
		this.actorRepo = actorRepo;
		this.filmRepo = filmRepo;
		this.cityRepo = cityRepo;
		this.countryRepo = countryRepo;
		this.filmActorRepo = filmActorRepo;
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
	public ResponseEntity<Actor> save(@RequestBody Actor actorDetails) {

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

	@GetMapping("/allFilmActor")
	public @ResponseBody
	Iterable<FilmActor> getAllFilmActor(){
		return filmActorRepo.findAll();
	}

	@GetMapping("/filmActor/{id}")
	public ResponseEntity<FilmActor> getFilmActorById(@PathVariable(value = "id") int filmActorId)
			throws ResourceAccessException {
		FilmActor filmActor = filmActorRepo.findById(filmActorId)
				.orElseThrow(() -> new ResourceAccessException("Record not found for this id: " + filmActorId));
		return ResponseEntity.ok().body(filmActor);
	}

	@GetMapping("/actorsFilms/{id}")
	public Set<Film> getActorsFilms(@PathVariable(value = "id") int actorId)
			throws ResourceAccessException {
		Actor actor = actorRepo.findById(actorId)
				.orElseThrow(() -> new ResourceAccessException("Actor not found for this id: " + actorId));
		return actor.getFilms();
	}
/*
	@GetMapping("/actorsFilms/{id}")
	public Set<Actor> getFilmsActors(@PathVariable(value = "id") int filmId)
			throws ResourceAccessException {
		Film film = filmRepo.findById(filmId)
				.orElseThrow(() -> new ResourceAccessException("Actor not found for this id: " + filmId));
		return film.getActors();
	}

 */


}
