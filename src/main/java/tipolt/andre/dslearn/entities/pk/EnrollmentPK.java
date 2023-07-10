package tipolt.andre.dslearn.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import tipolt.andre.dslearn.entities.Offer;
import tipolt.andre.dslearn.entities.User;

@Embeddable
@Data
public class EnrollmentPK implements Serializable{
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
}
