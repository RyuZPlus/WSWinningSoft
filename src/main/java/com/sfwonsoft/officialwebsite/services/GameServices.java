package com.sfwonsoft.officialwebsite.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfwonsoft.officialwebsite.models.dtos.GameDTO;
import com.sfwonsoft.officialwebsite.models.Game;
import com.sfwonsoft.officialwebsite.repositories.GameManagerRepository;

@Service
public class GameServices {

    @Autowired
    private GameManagerRepository gameManagerRepository;

    public List<Game> getListGames() {
        return gameManagerRepository.listGames();
    }

    public List<GameDTO> listGamesDTO() {
        List<Game> games = gameManagerRepository.listGames();

        return games.stream()
                .map(game -> new GameDTO(
                        game.getId_game(),
                        game.getGamename()))
                .collect(Collectors.toList());
    }
}
