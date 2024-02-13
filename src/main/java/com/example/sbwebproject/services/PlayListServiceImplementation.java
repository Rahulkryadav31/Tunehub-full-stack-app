package com.example.sbwebproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sbwebproject.entity.PlayList;
import com.example.sbwebproject.repositories.PlayListReposotory;

@Service
public class PlayListServiceImplementation 
implements PlayListService {
	
	@Autowired
	PlayListReposotory prepo;

	@Override
	public void addPlaylist(PlayList playlist) {
		prepo.save(playlist);
	}

	@Override
	public List<PlayList> fetchPlaylists() {
		
		return prepo.findAll() ;
	}

}
