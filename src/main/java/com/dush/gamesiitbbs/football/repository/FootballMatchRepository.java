package com.dush.gamesiitbbs.football.repository;

import com.dush.gamesiitbbs.football.model.FootballMatch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballMatchRepository extends CrudRepository<FootballMatch,String>{
}
