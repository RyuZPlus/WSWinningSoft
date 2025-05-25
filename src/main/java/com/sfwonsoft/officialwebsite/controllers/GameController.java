package com.sfwonsoft.officialwebsite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfwonsoft.officialwebsite.models.dtos.GameDTO;
import com.sfwonsoft.officialwebsite.models.dtos.GameFeaturedProjection;
import com.sfwonsoft.officialwebsite.models.Game;
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
	
	@GetMapping("/featured")
	public ResponseEntity<List<GameFeaturedProjection>> getFeaturedGame() {
	    return ResponseEntity.ok(gameServices.getFeaturedGame());
	}
	
	@PostMapping("/set-featured/{id}")
    public ResponseEntity<String> setFeaturedGame(@PathVariable("id") int id) {
        gameServices.setFeaturedGame(id);
        return ResponseEntity.ok("Juego destacado actualizado correctamente.");
    }
}