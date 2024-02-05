package es.musica.musica.controller;


import es.musica.musica.entities.Songs;
import es.musica.musica.service.SongsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/view")
public class SongsController {

    private final SongsService songsService;

    public SongsController(SongsService songsService) {
        this.songsService = songsService;
    }


    @GetMapping
    public String homePage(){
        return "index";
    }
    @GetMapping("/song")
    public String getSongs(Model model){
        model.addAttribute("song", songsService.findAllSongs());
        return "song/songs";
    }

    @PostMapping("/add")
    public String saveSong(@ModelAttribute("s") Songs song){
        songsService.addSong(song);
        return "redirect:/view/song";
    }
    @GetMapping("songs/create")
    public String addNewSong(Model model){
        model.addAttribute("s", new Songs());
        return "song/add";
    }

    @GetMapping("/delete/{id}")
    public String deleteByID(@PathVariable("id") Long id){
        songsService.delete(id);
        return "redirect:/view/song";
    }

}
