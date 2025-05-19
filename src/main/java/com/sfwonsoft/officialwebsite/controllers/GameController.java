package com.sfwonsoft.officialwebsite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfwonsoft.officialwebsite.dtos.GameDTO;
import com.sfwonsoft.officialwebsite.models.Game;
import com.sfwonsoft.officialwebsite.repositories.GameRepository;

@RestController
@RequestMapping("/api")
public class GameController {
	@Autowired
    private GameRepository gameRepository;

	//@RequestMapping(path = "api/games", method = RequestMethod.GET)
	@GetMapping("api/games")
    public List<Game> listGames() {
        return gameRepository.listGames();
    }
	
	@GetMapping("api/gamesDto")
    public List<GameDTO> listGamesDTO() {
        return gameRepository.listGamesDTO();
    }
}
