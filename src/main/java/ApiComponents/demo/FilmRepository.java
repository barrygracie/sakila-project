package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Actor, Integer> {
}
