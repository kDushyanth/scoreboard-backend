package com.dush.gamesiitbbs.cricket.match_details.repository;

import com.dush.gamesiitbbs.cricket.match_details.model.CricketMatchDetails;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketMatchDetailsRepository extends CrudRepository<CricketMatchDetails,String>{
}
