package com.example.demo.artist;

import javax.persistence.*;

import com.example.demo.album.Album;
import com.example.demo.track.Track;

import java.util.List;

@Entity
@Table
public class Artist {
  // Attributes
  @Id
  @SequenceGenerator(
    name="artist_sequence",
    sequenceName = "artist_sequence",
    allocationSize = 1
  )
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "artist_sequence"
  )
  private Long id;

  private String name;

  @ManyToMany
  private List<Track> tracks;

  @OneToMany(mappedBy = "artist")
  private List<Album> albums;

  public Artist() {
  }

  public Artist(Long id, String name, List<Track> tracks, List<Album> albums) {
    this.id = id;
    this.name = name;
    this.tracks = tracks;
    this.albums = albums;
  }

  public Artist(String name, List<Track> tracks, List<Album> albums) {
    this.name = name;
    this.tracks = tracks;
    this.albums = albums;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Track> getTracks() {
    return tracks;
  }

  public void setTracks(List<Track> tracks) {
    this.tracks = tracks;
  }

  public List<Album> getAlbums() {
    return albums;
  }

  public void setAlbums(List<Album> albums) {
    this.albums = albums;
  }

  
}
