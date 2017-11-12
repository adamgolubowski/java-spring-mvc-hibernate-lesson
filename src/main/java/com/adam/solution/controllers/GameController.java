package com.adam.solution.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adam.solution.model.Game;
import com.adam.solution.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping("/list")
	public String listGames(Model model){
		List<Game> games = gameService.listGames();
		model.addAttribute("games", games);
		return "games-list";
	}
	
	@GetMapping("/new")
	public String createNewGame(Model model) {
		Game newGame = new Game();
		model.addAttribute("newGame",newGame);
		return "new-game-form";
	}
	
	@PostMapping("/save")
	public String saveNewGame(@ModelAttribute("newGame") Game newGame) {
		gameService.createGame(newGame);
		return "redirect:/game/list";
	}
	
	@RequestMapping("/results")
	public String trackResults(Model model) {
		return "results-tracker";
	}
	
}
