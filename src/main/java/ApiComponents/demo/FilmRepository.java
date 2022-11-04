package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film order by rand() limit 8")
    List<Film> getRandom8Films();


}
