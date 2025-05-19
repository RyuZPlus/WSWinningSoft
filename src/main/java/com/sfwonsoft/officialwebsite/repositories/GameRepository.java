package com.sfwonsoft.officialwebsite.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.sfwonsoft.officialwebsite.dtos.GameDTO;
import com.sfwonsoft.officialwebsite.models.Game;

@Repository
public class GameRepository {
	@Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Game> listGames() {
        String sql = "EXEC sp_list_games";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Game.class));
    }
    
    public List<GameDTO> listGamesDTO() {
        String sql = "EXEC sp_list_games";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            GameDTO dto = new GameDTO();
            dto.setId_game(rs.getInt("id_game"));
            dto.setGamename(rs.getString("gamename"));
            return dto;
        });
    }
}
