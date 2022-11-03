package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.actor where actor_id<201 order by rand() limit 1")
    Actor selectActor();

}
