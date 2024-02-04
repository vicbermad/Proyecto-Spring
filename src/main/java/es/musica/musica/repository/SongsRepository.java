package es.musica.musica.repository;

import es.musica.musica.entities.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SongsRepository extends JpaRepository<Songs, Long> {

    @Query("SELECT s FROM Songs s JOIN Album a ON a.id = s.album.id WHERE a.id = :idAlbum")
    List<Songs> getSongsByAlbumId(Long idAlbum);

    @Query("SELECT SUM(s.duration) FROM Songs s WHERE s.album.id = :idAlbum")
    Integer albumDuration(Long idAlbum);
}
