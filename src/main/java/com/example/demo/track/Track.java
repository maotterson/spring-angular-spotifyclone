package com.example.demo.track;

import javax.persistence.*;

import com.example.demo.album.Album;
import com.example.demo.artist.Artist;

import java.util.List;

@Entity
@Table
public class Track {
  // Attributes
  @Id
  @SequenceGenerator(
    name="track_sequence",
    sequenceName = "track_sequence",
    allocationSize = 1
  )
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "track_sequence"
  )
  private Long id;

  private String title;

  @ManyToOne
  private Album album;
  
  @ManyToMany
  private List<Artist> artists;

  public Track() {
  }

  public Track(Long id, String title, Album album, List<Artist> artists) {
    this.id = id;
    this.title = title;
    this.album = album;
    this.artists = artists;
  }

  public Track(String title, Album album, List<Artist> artists) {
    this.title = title;
    this.album = album;
    this.artists = artists;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }

  public List<Artist> getArtists() {
    return artists;
  }

  public void setArtists(List<Artist> artists) {
    this.artists = artists;
  }
  
  
}
