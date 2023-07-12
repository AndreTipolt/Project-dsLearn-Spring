package tipolt.andre.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tipolt.andre.dslearn.entities.Deliver;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver, Long>{
    
}
