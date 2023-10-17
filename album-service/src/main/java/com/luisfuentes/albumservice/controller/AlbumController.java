package com.luisfuentes.albumservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisfuentes.albumservice.dto.ResponseDTO;
import com.luisfuentes.albumservice.entity.Album;
import com.luisfuentes.albumservice.service.AlbumService;

@RestController
@RequestMapping("/albums")
public class AlbumController {

	@Autowired
	private AlbumService albumService;

	@PostMapping
	public Album createAlbum(@RequestBody Album album) {
		return albumService.createAlbum(album);
	}

	@GetMapping
	public List<Album> getAllAlbum() {
		return albumService.getAllAlbum();
	}

	@DeleteMapping("{id}")
	public void deleteAlbumById(@PathVariable("id") Long id) {
		albumService.deleteAlbumById(id);
	}

	@GetMapping("/{id}")
	public ResponseDTO getAlbumById(@PathVariable Long id) {
		return albumService.getAlbumById(id);
	}

}
