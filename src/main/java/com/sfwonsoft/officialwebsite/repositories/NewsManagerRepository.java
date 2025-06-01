package com.sfwonsoft.officialwebsite.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sfwonsoft.officialwebsite.models.New;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

@Repository
public class NewsManagerRepository {
	@PersistenceContext
    private EntityManager entityManager;
	public List<New> listNews(Integer gameId, int limit) {
        StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("New.listNews");
        
        if (gameId != null) {
            query.setParameter("game_id", gameId);
        } else {
            query.setParameter("game_id", null);
        }
        
        List<New> result = query.getResultList();
        return result.stream().limit(limit).toList();
    }
}
