package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {


    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film order by rand() limit 4")
    List<Film> getRandom4Films();

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film order by rand() limit 1")
    Film getRandomFilm();


}
