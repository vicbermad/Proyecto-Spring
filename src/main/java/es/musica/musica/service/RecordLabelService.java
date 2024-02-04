package es.musica.musica.service;

import es.musica.musica.entities.RecordLabel;
import es.musica.musica.exception.CustomException;
import es.musica.musica.exception.ErrorCode;
import es.musica.musica.repository.RecordLabelRepository;
import org.springframework.stereotype.Service;

@Service
public class RecordLabelService {
    private final RecordLabelRepository repository;

    public RecordLabelService(RecordLabelRepository repository) {
        this.repository = repository;
    }

    public RecordLabel updateRecordLabel (RecordLabel recordLabel) throws CustomException {
        if (recordLabel.getId() != null) {
            return repository.save(recordLabel);
        }
        throw new CustomException(ErrorCode.ID_NOTFOUND, "The field id is mandatory.");
    }

    public RecordLabel MaxCapitalRL (){
        return repository.findRLWithMaxCapital();
    }
}
