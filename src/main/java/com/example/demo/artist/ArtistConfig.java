package com.example.demo.artist;

import java.util.List;

import com.example.demo.album.Album;
import com.example.demo.track.Track;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfig {
  @Bean
  CommandLineRunner commandLineRunner(
    ArtistRepository repository
  ){
    List<Track> tracks = List.of();
    List<Album> albums = List.of();
    return args -> {
      new Artist(1L, "Taylor Swift", tracks, albums);
    };
  }
}
