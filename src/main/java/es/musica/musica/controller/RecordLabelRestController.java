package es.musica.musica.controller;

import es.musica.musica.entities.RecordLabel;
import es.musica.musica.exception.CustomException;
import es.musica.musica.service.RecordLabelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiRecordLabel")
public class RecordLabelRestController {

    private final RecordLabelService recordLabelService;

    public RecordLabelRestController(RecordLabelService recordLabelService) {
        this.recordLabelService = recordLabelService;
    }

    @PutMapping("/updateRL")
    public ResponseEntity<RecordLabel> changeRL(@RequestBody RecordLabel recordLabel) {
        try {
            return new ResponseEntity<>(recordLabelService.updateRecordLabel(recordLabel), HttpStatus.OK);
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/maxCapital")
    public ResponseEntity<RecordLabel> recordLabel(){
        return new ResponseEntity<>(recordLabelService.MaxCapitalRL(), HttpStatus.OK);
    }
}
