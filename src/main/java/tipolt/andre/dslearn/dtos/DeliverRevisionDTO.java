package tipolt.andre.dslearn.dtos;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import tipolt.andre.dslearn.entities.Deliver;
import tipolt.andre.dslearn.entities.enums.DeliverStatus;

@Data
@AllArgsConstructor
public class DeliverRevisionDTO implements Serializable{

    private DeliverStatus status;
	private String feedback;
	private Integer correctCount;

	public DeliverRevisionDTO(Deliver entity){
		BeanUtils.copyProperties(entity, this);
	}
}
