package es.musica.musica.service;

import es.musica.musica.dto.AlbumDTO;
import es.musica.musica.entities.Album;
import es.musica.musica.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepository repository;

    public AlbumService(AlbumRepository repository) {
        this.repository = repository;
    }


    public List<Album> findAllAlbums(){
        return repository.findAll();
    }

    public List<AlbumDTO> findLPAlbums(){
        return repository.findLP();
    }
    public List<AlbumDTO> findEPAlbums(){
        return repository.findEP();
    }

    public List<Album> searchAlbumsByName(String albumName) {
        return repository.findByName(albumName);
    }
}
