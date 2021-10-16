package com.example.demo.artist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService {
  
  private final IArtistRepository artistRepository;

  @Autowired
  public ArtistService(IArtistRepository artistRepository){
    this.artistRepository = artistRepository;
  }

  public List<Artist> getArtists() {
    return this.artistRepository.findAll();
  }
}
