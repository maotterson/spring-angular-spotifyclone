package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {
  @GetMapping("/api/artists")
  public String getArtists() {
    return "Getting artists";
  }

  @PostMapping("/api/artists")
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
