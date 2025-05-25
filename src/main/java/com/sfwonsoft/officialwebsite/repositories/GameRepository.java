package com.sfwonsoft.officialwebsite.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sfwonsoft.officialwebsite.models.Game;
import com.sfwonsoft.officialwebsite.models.dtos.GameFeaturedProjection;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

	@Procedure(name = "Game.updateFeaturedGame")
    void updateFeaturedGame(@Param("GameId") Integer gameId);
	
	List<GameFeaturedProjection> findByIsFeaturedTrue();
}