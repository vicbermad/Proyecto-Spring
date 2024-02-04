package es.musica.musica.service;

import es.musica.musica.entities.Songs;
import es.musica.musica.repository.SongsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsService {

    private final SongsRepository repository;

    public SongsService(SongsRepository repository) {
        this.repository = repository;
    }

    public void delete (Long id){
        repository.deleteById(id);
    }

    public List<Songs> findSongsByAlbumId (Long idAlbum){
        return repository.getSongsByAlbumId(idAlbum);
    }

    public Integer getAlbumDuration(Long idAlbum) {
        return repository.albumDuration(idAlbum);
    }
}
