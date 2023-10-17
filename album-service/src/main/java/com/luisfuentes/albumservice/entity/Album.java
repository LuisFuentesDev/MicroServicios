package com.luisfuentes.albumservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "albums")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameAlbum;
	private Integer totalSongs;
	private Integer albumDuration;
	@Column(name = "artist_id", nullable = false, unique = true)
	private String artistId;

}
