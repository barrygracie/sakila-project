package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.country order by rand() limit 4")
    Iterable<Country> getRandomCountry();


}
