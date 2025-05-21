package com.sfwonsoft.officialwebsite.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sfwonsoft.officialwebsite.models.Game;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

@Repository
public class GameManagerRepository {
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Game> listGames() {
        StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("Game.listGame");
        return query.getResultList();
    }
}