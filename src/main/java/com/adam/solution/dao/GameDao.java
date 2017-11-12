package com.adam.solution.dao;

import java.util.List;

import com.adam.solution.model.Game;

public interface GameDao {
	public List<Game> listGames();
	public void createGame(Game game);
	public void deleteGame(int id);
}
