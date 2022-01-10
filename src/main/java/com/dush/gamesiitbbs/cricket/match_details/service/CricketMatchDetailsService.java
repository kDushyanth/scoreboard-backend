package com.dush.gamesiitbbs.cricket.match_details.service;

import java.util.Optional;
import java.util.UUID;

import com.dush.gamesiitbbs.cricket.match_details.model.CricketMatchDetails;
import com.dush.gamesiitbbs.cricket.match_details.repository.CricketMatchDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CricketMatchDetailsService {
    
    @Autowired
    private CricketMatchDetailsRepository cricketMatchRepository;
    public CricketMatchDetails saveCricketMatch(CricketMatchDetails cricketMatch){
        return cricketMatchRepository.save(new CricketMatchDetails(
            UUID.randomUUID().toString(),
            cricketMatch.getNumber(),
            cricketMatch.getTournamentId(),
            cricketMatch.getTournamentName(),
            cricketMatch.getDate(),
            cricketMatch.getCricketTeamScores()
        ));
    }
    public Optional<CricketMatchDetails> findCricketMatchById(String id){
        return cricketMatchRepository.findById(id);
    }
}
