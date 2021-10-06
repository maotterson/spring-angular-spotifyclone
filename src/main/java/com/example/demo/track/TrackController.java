package com.example.demo.track;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackController {
  @GetMapping("/api/tracks")
  public String getTracks() {
    return "Getting tracks";
  }

  @PostMapping("/api/tracks")
  public String insertTrack() {
    return "Inserting track";
  }

  @DeleteMapping("api/tracks/{trackId}")
  public String deleteTrack(@PathVariable("trackId") int trackId){
    return "Deleting track" + trackId;
  }

  @PutMapping("api/tracks/{trackId}")
  public String updateTrack(@PathVariable("trackId") int trackId){
    return "Updated track" + trackId;
  }
}
