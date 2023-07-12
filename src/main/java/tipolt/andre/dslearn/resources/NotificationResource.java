package tipolt.andre.dslearn.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tipolt.andre.dslearn.dtos.NotificationDTO;
import tipolt.andre.dslearn.services.NotificationService;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource {
    
    @Autowired
    private NotificationService notificationService;


    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> findById(Pageable page){
        
        Page<NotificationDTO> notifications = notificationService.notificationsForCurrentUser(page);

        return ResponseEntity.ok().body(notifications);
    }
}
