package com.sfwonsoft.officialwebsite.models;

import lombok.Data;

@Data
public class Game {
	private int id_game;
    private String gamename;
    private String descriptiongame;
    private String imageUrl;
    private String release;
    private String urlStore;
    private String platforms;
}
