package tipolt.andre.dslearn.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tipolt.andre.dslearn.entities.User;
import tipolt.andre.dslearn.repositories.UserRepository;
import tipolt.andre.dslearn.services.exceptions.ForbiddenException;
import tipolt.andre.dslearn.services.exceptions.UnauthorizedException;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public User authenticated(){
        try {

            String username = SecurityContextHolder.getContext().getAuthentication().getName(); // Pega o nome do usuario que esta no token (email no caso)
            return userRepository.findByEmail(username).get();

        } catch (Exception e) {
            throw new UnauthorizedException("Invalid User");
        }
    }

    public void validateSelfOrAdmin(Long userId){ // Id vindo da url
        User user = authenticated();

        if(!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")){
            throw new ForbiddenException("Acess denied");
        }
    }
    
}
