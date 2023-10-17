package com.luisfuentes.albumservice.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDTO {
	
	private String artistName;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Integer age;
}
