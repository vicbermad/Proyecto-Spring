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
@Getter
@Setter
@ToString
@Entity
@Table(name = "album")
public class Album {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "songs_num")
    private int songsNum;

    @Column(nullable = false, name = "release_year")
    private String releaseYear;

    @JsonBackReference
    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;

    @JsonManagedReference
    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Songs> songs;
}
