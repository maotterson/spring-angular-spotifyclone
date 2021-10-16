package com.example.demo.album;

import javax.persistence.*;

import com.example.demo.artist.Artist;
import com.example.demo.track.Track;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class Album {
  // Attributes
  @Id
  @SequenceGenerator(
    name="album_sequence",
    sequenceName = "album_sequence",
    allocationSize = 1
  )
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "album_sequence"
  )
  private Long id;

  private String title;

  @OneToMany(mappedBy = "album")
  private List<Track> tracks;

  @ManyToOne
  private Artist artist;

  @Column(name = "local_date", columnDefinition = "DATE")
  private LocalDate date;

  public Album() {
  }

  public Album(Long id, String title, List<Track> tracks, Artist artist, LocalDate date) {
    this.id = id;
    this.title = title;
    this.tracks = tracks;
    this.artist = artist;
    this.date = date;
  }

  public Album(String title, List<Track> tracks, Artist artist, LocalDate date) {
    this.title = title;
    this.tracks = tracks;
    this.artist = artist;
    this.date = date;
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

  public List<Track> getTracks() {
    return tracks;
  }

  public void setTracks(List<Track> tracks) {
    this.tracks = tracks;
  }

  public Artist getArtist() {
    return artist;
  }

  public void setArtist(Artist artist) {
    this.artist = artist;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  

  

}
