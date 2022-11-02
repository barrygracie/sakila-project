package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film order by rand() limit 8")
    Set<Film> getRandom8Films();

    @Query(nativeQuery = true, value = "SELECT film.*, category.category_id, category.name FROM film INNER JOIN film_category ON film.film_id = film_category.film_id INNER JOIN category ON film_category.category_id = category.category_id WHERE category.category_id = film_category.category_id AND film.film_id = film_category.film_id")
    Iterable<Film> getCategoryFilm();
}
