package tipolt.andre.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tipolt.andre.dslearn.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
