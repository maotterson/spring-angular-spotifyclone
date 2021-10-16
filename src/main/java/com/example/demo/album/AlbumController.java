package com.example.demo.album;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/albums")
public class AlbumController {
  private final AlbumService albumService;

  public AlbumController(AlbumService albumService){
    this.albumService = albumService;
  }

  @GetMapping
  public List<Album> getAlbums() {
    return albumService.getAlbums();
  }

  @PostMapping
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
