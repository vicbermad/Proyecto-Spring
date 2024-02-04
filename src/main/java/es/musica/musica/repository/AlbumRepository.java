package es.musica.musica.repository;

import es.musica.musica.dto.AlbumDTO;
import es.musica.musica.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {

    @Query("SELECT new es.musica.musica.dto.AlbumDTO(a.id, a.name, a.songsNum) FROM Album a WHERE a.songsNum >= 8")
    List<AlbumDTO> findLP();

    @Query(value ="SELECT * FROM album WHERE songs_num < 8", nativeQuery = true)
    List<AlbumDTO> findEP();

    List<Album> findByName(String name);

}
