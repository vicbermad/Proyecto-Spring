package es.musica.musica.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "artist")
public class Artist {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "active_years")
    private int activeYears;


    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "record_label_id")
    private RecordLabel recordLabel;

    @JsonManagedReference
    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Album> album;
}
