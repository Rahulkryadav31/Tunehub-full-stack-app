package com.example.sbwebproject.services;

import java.util.List;

import com.example.sbwebproject.entity.Songs;

public interface SongsService {
	public String addSongs(Songs song);
	
	public boolean songExists(String name);
	
	public List<Songs> fetchAllSongs();

	public void updateSong(Songs song);


}
