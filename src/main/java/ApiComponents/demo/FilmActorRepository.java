package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmActorRepository extends JpaRepository<Actor, Integer> {
}
