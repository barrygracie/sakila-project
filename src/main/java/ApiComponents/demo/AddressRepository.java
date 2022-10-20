package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Actor, Integer> {
}
