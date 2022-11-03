package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

    @Query(nativeQuery = true, value = "Select * from sakila.actor")
    List<Actor> testActor();
}
