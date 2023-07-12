package tipolt.andre.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tipolt.andre.dslearn.entities.Lesson;

@Repository
public interface NotificationRepository extends JpaRepository<Lesson, Long>{
    
}
