package com.dush.gamesiitbbs.football.tournament_details.service;

import com.dush.gamesiitbbs.football.tournament_details.model.FootballTournamentDetails;
import com.dush.gamesiitbbs.football.tournament_details.repository.FootballTournamentDetailsRepository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballTournamentDetailsService {
    @Autowired
    FootballTournamentDetailsRepository footballTournamentDetailsRepository;
    
    public Optional<FootballTournamentDetails>findFootballTournamentDetailsById(String id){
        return footballTournamentDetailsRepository.findById(id);
    } 
}
