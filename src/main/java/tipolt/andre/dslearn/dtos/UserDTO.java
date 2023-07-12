package tipolt.andre.dslearn.dtos;

import java.io.Serializable;

import lombok.Data;
import tipolt.andre.dslearn.entities.User;

@Data
public class UserDTO implements Serializable{
    private Long id;
    private String name;
    private String email;

    public UserDTO(User entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
    }
}
