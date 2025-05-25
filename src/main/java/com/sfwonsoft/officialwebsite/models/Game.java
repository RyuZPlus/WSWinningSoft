package com.sfwonsoft.officialwebsite.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "games")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
	        name = "Game.listGame",
	        procedureName = "sp_list_games",
	        resultClasses = Game.class
	    ),
	@NamedStoredProcedureQuery(
	        name = "Game.updateFeaturedGame",
	        procedureName = "sp_update_featured_game",
	        parameters = {
	            @jakarta.persistence.StoredProcedureParameter(mode = jakarta.persistence.ParameterMode.IN, name = "GameId", type = Integer.class)
	        }
	    ),
	@NamedStoredProcedureQuery(
		    name = "Game.getFeaturedGame",
		    procedureName = "sp_get_featured_game",
		    resultClasses = Game.class
		)
})
@Data
public class Game {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idgame;
    private String gamename;
    private String descriptiongame;
    private String imageUrl;
    private String release;
    private Boolean isFeatured;
    private String platforms;
}