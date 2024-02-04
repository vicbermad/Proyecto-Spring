package es.musica.musica.controller;

import es.musica.musica.dto.AlbumDTO;
import es.musica.musica.entities.Album;
import es.musica.musica.service.AlbumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiAlbum")
public class AlbumRestController {
    private final AlbumService albumService;

    public AlbumRestController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/albums")
    public ResponseEntity<List<Album>> getAlbums(){
        return new ResponseEntity<>(albumService.findAllAlbums(), HttpStatus.OK);
    }

    @GetMapping("/longPlayAlbums/all")
    public ResponseEntity<List<AlbumDTO>> getLPAlbums() {
        return new ResponseEntity<>(albumService.findLPAlbums(), HttpStatus.OK);
    }

    @GetMapping("/extendedPlayAlbums/all")
    public ResponseEntity<List<AlbumDTO>> getEPAlbums() {
        return new ResponseEntity<>(albumService.findEPAlbums(), HttpStatus.OK);
    }

    @GetMapping("/albums/searchName")
    public ResponseEntity<List<Album>> searchAlbumsByName(@RequestParam("name") String albumName) {
        return new ResponseEntity<>(albumService.searchAlbumsByName(albumName), HttpStatus.OK);
    }

}
