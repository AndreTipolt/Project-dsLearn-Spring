package tipolt.andre.dslearn.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_lesson")
@Data
public class Task extends Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Integer questionCount;
    private Integer approvalCount;

    private Double weight;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueDate;
}
