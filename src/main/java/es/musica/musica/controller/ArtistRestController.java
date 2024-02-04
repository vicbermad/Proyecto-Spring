package es.musica.musica.controller;

import es.musica.musica.controller.util.ArtistFieldSort;
import es.musica.musica.entities.Artist;
import es.musica.musica.service.ArtistService;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiArtist")
public class ArtistRestController {
    private final ArtistService artistService;

    public ArtistRestController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/artists")
    public ResponseEntity<List<Artist>> getArtists(){
        return new ResponseEntity<>(artistService.findAllArtists(), HttpStatus.OK);
    }

    @GetMapping("/pageSort")
    public ResponseEntity<List<Artist>> getArtists(@RequestParam(defaultValue = "1") Integer pageNo,
                                @RequestParam(defaultValue = "3") Integer pageSize,
                                @RequestParam(required = false, defaultValue = "name") ArtistFieldSort sortBy,
                                @RequestParam(defaultValue = "ASC")
                                Sort.Direction orderBy){
        return new ResponseEntity<>(artistService.findAllPageabled(pageNo-1, pageSize, sortBy, orderBy), HttpStatus.OK);
    }

    @PostMapping("/addArtist")
    public ResponseEntity<Artist> newArtist(@RequestBody Artist artist){
        Artist newArtist = artistService.addArtist(artist);
        return new ResponseEntity<>(newArtist, HttpStatus.CREATED);
    }
}
