package tipolt.andre.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tipolt.andre.dslearn.dtos.NotificationDTO;
import tipolt.andre.dslearn.entities.Notification;
import tipolt.andre.dslearn.entities.User;
import tipolt.andre.dslearn.repositories.NotificationRepository;

@Service
public class NotificationService {
    
    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable){

        User user = authService.authenticated();

        Page<Notification> page = notificationRepository.findByUser(user, pageable);

        return page.map((notification) -> new NotificationDTO(notification));
    }
}
