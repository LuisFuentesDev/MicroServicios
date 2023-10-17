package com.luisfuentes.artistservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisfuentes.artistservice.entity.Artist;
import com.luisfuentes.artistservice.repository.ArtistRepository;

@Service
public class ArtistService {

	@Autowired
	private ArtistRepository artistRepository;

	public Artist createArtist(Artist artist) {
		return artistRepository.save(artist);
	}

	public List<Artist> getAllArtist() {
		return artistRepository.findAll();
	}
	public void deleteArtistById(Long id) {
		artistRepository.deleteById(id);
	}
	public Artist getArtistById(Long id) {
		Optional<Artist> optionalArtist = artistRepository.findById(id);
		return optionalArtist.get();
	}
}
