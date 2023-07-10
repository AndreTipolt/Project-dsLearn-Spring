package tipolt.andre.dslearn.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tipolt.andre.dslearn.entities.pk.EnrollmentPK;

@Entity
@Table(name = "tb_enrollment")
@NoArgsConstructor
@Getter
@Setter
public class Enrollment {
    
    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;
    private boolean avaliable;
    private boolean onlyUpdate;

    public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean avaliable,
            boolean onlyUpdate) {
        id.setUser(user);
        id.setOffer(offer);
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.avaliable = avaliable;
        this.onlyUpdate = onlyUpdate;
    }

    public User getUser(){
        return id.getUser();
    }
    
    public void setStudent(User user){
        id.setUser(user);
    }

    public Offer getOffer(){
        return id.getOffer();
    }
    
    public void setOffer(Offer offer){
        id.setOffer(offer);
    }
}
