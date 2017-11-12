package com.adam.solution.service;

import java.util.List;

import com.adam.solution.model.Game;

public interface GameService {
	public List<Game> listGames();
	public void createGame(Game game);
	public void deleteGame(int id);

}
