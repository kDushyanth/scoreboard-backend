package com.dush.gamesiitbbs.cricket.tournament.repository;

import com.dush.gamesiitbbs.cricket.tournament.model.CricketTournament;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketTournamentRepository extends CrudRepository<CricketTournament,String>{
}
