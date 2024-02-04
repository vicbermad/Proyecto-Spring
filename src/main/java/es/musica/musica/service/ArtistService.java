package es.musica.musica.service;

import es.musica.musica.controller.util.ArtistFieldSort;
import es.musica.musica.entities.Artist;
import es.musica.musica.repository.ArtistRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    private final ArtistRepository repository;

    public ArtistService(ArtistRepository repository) {
        this.repository = repository;
    }


    public List<Artist> findAllArtists(){
        return repository.findAll();
    }

    public List<Artist> findAllPageabled(Integer pageNo, Integer pageSize, ArtistFieldSort sortBy, Sort.Direction orderBy){
        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(orderBy, sortBy.getField()));
        return repository.findAll(pageable).getContent();
    }
    public Artist addArtist(Artist artist){
        return repository.save(artist);
    }
}
