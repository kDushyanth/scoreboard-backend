package com.dush.gamesiitbbs.cricket.match.service;

import java.util.Optional;
import java.util.UUID;

import com.dush.gamesiitbbs.cricket.match.model.CricketMatch;
import com.dush.gamesiitbbs.cricket.match.repository.CricketMatchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CricketMatchService{
    @Autowired
    CricketMatchRepository cricketMatchRepository;
    public Optional<CricketMatch> findCricketMatchById(String id){
        return cricketMatchRepository.findById(id);
    }
    public CricketMatch addCricketMatch(CricketMatch cricketMatch){
        return cricketMatchRepository.save(new CricketMatch(
            UUID.randomUUID().toString(),
            cricketMatch.getNumber(),
            cricketMatch.getTournamentId(),
            cricketMatch.getTournamentName(),
            cricketMatch.getDate(),
            cricketMatch.getTeam1Name(),
            cricketMatch.getTeam2Name(),
            cricketMatch.getTeam1Goals(),
            cricketMatch.getTeam2Goals()
        ));
    }
}
