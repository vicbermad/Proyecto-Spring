package es.musica.musica.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "record_label")
public class RecordLabel {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "creation_year")
    private String creationYear;

    @Column(nullable = false)
    private int capital;

    @JsonManagedReference
    @OneToOne(mappedBy = "recordLabel", cascade = CascadeType.ALL)
    private Artist artist;
}
