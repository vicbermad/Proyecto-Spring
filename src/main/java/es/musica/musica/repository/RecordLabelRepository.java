package es.musica.musica.repository;

import es.musica.musica.entities.RecordLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RecordLabelRepository extends JpaRepository<RecordLabel, Long> {

    @Query("SELECT r FROM RecordLabel r WHERE r.capital = (SELECT MAX(r2.capital) FROM RecordLabel r2)")
    RecordLabel findRLWithMaxCapital();
}
