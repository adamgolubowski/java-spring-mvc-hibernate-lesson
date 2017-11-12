package com.adam.solution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adam.solution.dao.GameDao;
import com.adam.solution.model.Game;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameDao dao;
	
	public void createGame(Game game) {
		dao.createGame(game);

	}

	public void deleteGame(int id) {
		dao.deleteGame(id);
	}

	public List<Game> listGames() {
		return dao.listGames();
	}

}
