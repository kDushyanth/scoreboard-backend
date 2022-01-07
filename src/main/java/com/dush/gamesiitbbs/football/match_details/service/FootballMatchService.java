package com.dush.gamesiitbbs.football.match_details.service;

import java.util.Optional;
import java.util.UUID;

import com.dush.gamesiitbbs.football.match_details.model.FootballMatch;
import com.dush.gamesiitbbs.football.match_details.repository.FootballMatchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballMatchService {
    
    @Autowired
    private FootballMatchRepository footballMatchRepository;
    public FootballMatch saveFootballMatch(FootballMatch footballMatch){
        return footballMatchRepository.save(new FootballMatch(
            UUID.randomUUID().toString(),
            footballMatch.getNumber(),
            footballMatch.getTournamentId(),
            footballMatch.getTournamentName(),
            footballMatch.getDate(),
            footballMatch.getFootballTeamScores()
        ));
    }
    public Optional<FootballMatch> findFootballMatchById(String id){
        return footballMatchRepository.findById(id);
    }
}
