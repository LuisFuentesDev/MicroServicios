package com.luisfuentes.albumservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisfuentes.albumservice.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{

}
