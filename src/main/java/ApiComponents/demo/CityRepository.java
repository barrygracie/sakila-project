package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.city where country_id = ?1 order by rand() limit 1")
    City selectCityFromCountry(int countryId);

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.city order by rand() limit 1")
    City getOneRandomCity();
}
