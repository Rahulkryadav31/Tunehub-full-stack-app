package com.example.sbwebproject.services;

import java.util.List;

import com.example.sbwebproject.entity.PlayList;

public interface PlayListService {

	public void addPlaylist(PlayList playlist);

	public List<PlayList> fetchPlaylists();

}
