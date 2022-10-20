package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<Actor, Integer> {
}
