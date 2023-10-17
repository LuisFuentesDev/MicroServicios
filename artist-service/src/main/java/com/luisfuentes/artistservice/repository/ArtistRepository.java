package com.luisfuentes.artistservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisfuentes.artistservice.entity.Artist;

public interface ArtistRepository  extends JpaRepository<Artist, Long>{

}
