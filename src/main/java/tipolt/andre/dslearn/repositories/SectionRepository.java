package tipolt.andre.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tipolt.andre.dslearn.entities.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long>{
    
}
