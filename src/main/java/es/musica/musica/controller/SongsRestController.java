package es.musica.musica.controller;

import es.musica.musica.entities.Songs;
import es.musica.musica.service.SongsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiSongs")
public class SongsRestController {

    private final SongsService songsService;


    public SongsRestController(SongsService songsService) {
        this.songsService = songsService;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        songsService.delete(id);
        return new ResponseEntity<>("The song was deleted", HttpStatus.OK);
    }

    @GetMapping("/{idAlbum}/song")
    public ResponseEntity<List<Songs>> getSongs(@PathVariable("idAlbum") Long idAlbum){
        return new ResponseEntity<>(songsService.findSongsByAlbumId(idAlbum), HttpStatus.OK);
    }

    @GetMapping("/albumDuration/{idAlbum}")
        public ResponseEntity<Integer> totalAlbumDuration(@PathVariable("idAlbum") Long idAlbum){
        return new ResponseEntity<>(songsService.getAlbumDuration(idAlbum), HttpStatus.OK);
    }

}
