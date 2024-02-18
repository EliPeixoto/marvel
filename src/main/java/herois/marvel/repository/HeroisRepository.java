package herois.marvel.repository;

import herois.marvel.herois.Herois;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroisRepository extends JpaRepository<Herois, Long>{
}
