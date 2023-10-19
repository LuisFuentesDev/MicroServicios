package com.luisfuentes.albumservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.luisfuentes.albumservice.dto.ArtistDTO;
import com.luisfuentes.albumservice.dto.ResponseDTO;
import com.luisfuentes.albumservice.entity.Album;
import com.luisfuentes.albumservice.repository.AlbumRepository;

@Service
public class AlbumService {

	@Autowired
	private AlbumRepository albumRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Album createAlbum(Album album) {
		return albumRepository.save(album);
	}

	public List<Album> getAllAlbum() {
		return albumRepository.findAll();
	}

	public void deleteAlbumById(Long id) {
		albumRepository.deleteById(id);
	}

	public ResponseDTO getAlbumById(Long id) {
		ResponseDTO responseDTO = new ResponseDTO();
		Album album = new Album();
		album = albumRepository.findById(id).get();

		ResponseEntity<ArtistDTO> responseEntity = restTemplate
				.getForEntity("http://localhost:8080/artists/" + album.getArtistId(), ArtistDTO.class);

		ArtistDTO artistDTO = responseEntity.getBody();

		responseDTO.setAlbum(album);
		responseDTO.setArtistDTO(artistDTO);
		
		return responseDTO;
	}
	public Album updateAlbum(Long id, Album updatedAlbum) {
		Optional<Album> optionalExistingAlbum = albumRepository.findById(id);

		if (optionalExistingAlbum.isPresent()) {
			Album existingAlbum = optionalExistingAlbum.get();
			existingAlbum.setNameAlbum(updatedAlbum.getNameAlbum());
			existingAlbum.setNameAlbum(updatedAlbum.getNameAlbum());
			existingAlbum.setAlbumDuration(updatedAlbum.getAlbumDuration());

			return albumRepository.save(existingAlbum);
		} else {

			return null;
		}
	}
}