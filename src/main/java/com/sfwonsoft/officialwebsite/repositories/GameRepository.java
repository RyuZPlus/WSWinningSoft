package com.sfwonsoft.officialwebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sfwonsoft.officialwebsite.models.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}