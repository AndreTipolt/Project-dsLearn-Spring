package tipolt.andre.dslearn.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_lesson")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class Lesson implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer position;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;
    
    @ManyToMany
    @JoinTable(
        name = "tb_lessons_done",
        joinColumns = @JoinColumn(name = "lesson_id"),
        inverseJoinColumns = { // pq é uma chave composta
            @JoinColumn(name = "user_id"),
            @JoinColumn(name = "offer_id")
        }
    )
    private Set<Enrollment> enrollmentsDone = new HashSet<>();
}
