package com.dush.gamesiitbbs.cricket.tournament_details.repository;

import com.dush.gamesiitbbs.cricket.tournament_details.model.CricketTournamentDetails;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketTournamentDetailsRepository extends CrudRepository<CricketTournamentDetails,String>{
}
