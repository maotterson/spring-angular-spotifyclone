package com.example.demo.models;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table
public class Album {
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
  private String artist;
  private String title;

  public Album() {
  }

  public Album(Long id, String artist, String title) {
    this.id = id;
    this.artist = artist;
    this.title = title;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Album [artist=" + artist + ", id=" + id + ", title=" + title + "]";
  }

  
  
}
