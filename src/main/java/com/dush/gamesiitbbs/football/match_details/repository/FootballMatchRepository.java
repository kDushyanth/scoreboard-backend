package com.dush.gamesiitbbs.football.match_details.repository;

import com.dush.gamesiitbbs.football.match_details.model.FootballMatch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballMatchRepository extends CrudRepository<FootballMatch,String>{
}
