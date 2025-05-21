package com.sfwonsoft.officialwebsite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfwonsoft.officialwebsite.models.dtos.GameDTO;
import com.sfwonsoft.officialwebsite.models.Game;
import com.sfwonsoft.officialwebsite.repositories.GameRepository;
import com.sfwonsoft.officialwebsite.services.GameServices;

@RestController
@RequestMapping("/api")
public class GameController {
	@Autowired
    private GameServices gameServices;

	//@RequestMapping(path = "api/games", method = RequestMethod.GET)
	@GetMapping("/games")
    public List<Game> listGames() {
        return gameServices.getListGames();
    }
	
	@GetMapping("/gamesDto")
    public List<GameDTO> listGamesDTO() {
        return gameServices.listGamesDTO();
    }
}