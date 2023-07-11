package tipolt.andre.dslearn.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_content")
@Data
public class Content extends Lesson {

    private String textContent;

    private String videoUri;
}
