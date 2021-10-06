package com.example.demo.album;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {
  @GetMapping("/api/albums")
  public String getAlbums() {
    return "Getting albums";
  }

  @PostMapping("/api/albums")
  public String insertAlbum() {
    return "Inserting album";
  }

  @DeleteMapping("api/albums/{albumId}")
  public String deleteAlbum(@PathVariable("albumId") int albumId){
    return "Deleting album" + albumId;
  }

  @PutMapping("api/albums/{albumId}")
  public String updateAlbum(@PathVariable("albumId") int albumId){
    return "Updated album" + albumId;
  }
}
