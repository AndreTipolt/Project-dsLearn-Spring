package tipolt.andre.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tipolt.andre.dslearn.entities.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long>{
    
}
