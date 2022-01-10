package com.dush.gamesiitbbs.cricket.match.repository;

import com.dush.gamesiitbbs.cricket.match.model.CricketMatch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketMatchRepository extends CrudRepository<CricketMatch,String>{
}
