package com.sfwonsoft.officialwebsite.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
	        name = "Game.listGame",
	        procedureName = "sp_list_games",
	        resultClasses = Game.class
	    )
})
@Data
public class Game {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_game;
    private String gamename;
    private String descriptiongame;
    private String imageUrl;
    private String release;
    private String urlStore;
    private String platforms;
}