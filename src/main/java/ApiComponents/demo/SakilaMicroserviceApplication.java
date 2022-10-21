package ApiComponents.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class SakilaMicroserviceApplication {

	@Autowired
	private ActorRepository actorRepo;

	@Autowired
	private AddressRepository addressRepo;

	@Autowired
	private CityRepository cityRepo;

	@Autowired
	private CountryRepository countryRepo;

	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private FilmRepository filmRepo;

	@Autowired
	private FilmActorRepository filmActorRepo;

	@Autowired
	private InventoryRepository inventoryRepo;

	@Autowired
	private RentalRepository rentalRepo;


	public SakilaMicroserviceApplication(ActorRepository actorRepo, FilmRepository filmRepo){
		this.actorRepo = actorRepo;
		this.filmRepo = filmRepo;
	}
	public static void main(String[] args) {
		SpringApplication.run(SakilaMicroserviceApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepo.findAll();
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepo.findAll();
	}

}
