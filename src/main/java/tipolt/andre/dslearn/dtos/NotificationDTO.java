package tipolt.andre.dslearn.dtos;

import java.io.Serializable;
import java.time.Instant;

import org.springframework.beans.BeanUtils;

import lombok.Data;
import tipolt.andre.dslearn.entities.Notification;

@Data
public class NotificationDTO implements Serializable{

    private Long id;
	private String text;
	
	private Instant moment;
	private boolean read;
	private String route;
	
	private Long userId;

    public NotificationDTO(Notification entity){
		BeanUtils.copyProperties(entity, this);
    }
}
