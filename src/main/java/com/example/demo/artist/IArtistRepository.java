package com.example.demo.artist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistRepository 
        extends JpaRepository<Artist, Long> {
  
}
