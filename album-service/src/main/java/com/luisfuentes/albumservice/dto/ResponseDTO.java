package com.luisfuentes.albumservice.dto;

import com.luisfuentes.albumservice.entity.Album;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

	private Album album;
	
	private ArtistDTO artistDTO;
}
