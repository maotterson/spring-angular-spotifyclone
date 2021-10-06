package com.example.demo.artist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/artists")
public class ArtistController {
  
  private final ArtistService artistService;

  @Autowired
  public ArtistController(ArtistService artistService) {
    this.artistService = artistService;
  }

  @GetMapping
  public List<Artist> getArtists() {
    return artistService.getArtists();
  }

  @PostMapping
  public String insertArtist() {
    return "Inserting artist";
  }

  @DeleteMapping("api/artists/{artistId}")
  public String deleteArtist(@PathVariable("artistId") int artistId){
    return "Deleting artist" + artistId;
  }

  @PutMapping("api/artists/{artistId}")
  public String updateArtist(@PathVariable("artistId") int artistId){
    return "Updated artist" + artistId;
  }
}
