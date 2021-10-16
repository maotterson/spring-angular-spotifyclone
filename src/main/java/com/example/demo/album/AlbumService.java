package com.example.demo.album;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AlbumService {
  private final IAlbumRepository albumRepository;

  @Autowired
  public AlbumService(IAlbumRepository albumRepository){
    this.albumRepository = albumRepository;
  }

  public List<Album> getAlbums() {
    return this.albumRepository.findAll();
  }
}
