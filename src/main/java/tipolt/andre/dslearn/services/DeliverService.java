package tipolt.andre.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tipolt.andre.dslearn.dtos.DeliverRevisionDTO;
import tipolt.andre.dslearn.entities.Deliver;
import tipolt.andre.dslearn.repositories.DeliverRepository;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository deliverRepository;

    @Transactional
    public void saveRevision(Long id, DeliverRevisionDTO deliverRevisionDTO) {

        Deliver deliver = deliverRepository.getOne(id);

        deliver.setStatus(deliverRevisionDTO.getStatus());
        deliver.setFeedback(deliverRevisionDTO.getFeedback());
        deliver.setCorrectCount(deliverRevisionDTO.getCorrectCount());

        deliverRepository.save(deliver);

    }
    
}
