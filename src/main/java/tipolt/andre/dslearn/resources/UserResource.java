package tipolt.andre.dslearn.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tipolt.andre.dslearn.dtos.UserDTO;
import tipolt.andre.dslearn.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @Autowired
    private UserService userService;


    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id){
        
        UserDTO userDTO = userService.findById(id);
        
        return ResponseEntity.ok().body(userDTO);
    }
}
