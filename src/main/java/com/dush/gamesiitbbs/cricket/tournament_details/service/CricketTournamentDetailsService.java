package com.dush.gamesiitbbs.cricket.tournament_details.service;

import com.dush.gamesiitbbs.cricket.tournament_details.model.CricketTournamentDetails;
import com.dush.gamesiitbbs.cricket.tournament_details.repository.CricketTournamentDetailsRepository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CricketTournamentDetailsService {
    @Autowired
    CricketTournamentDetailsRepository cricketTournamentDetailsRepository;
    
    public Optional<CricketTournamentDetails>findCricketTournamentDetailsById(String id){
        return cricketTournamentDetailsRepository.findById(id);
    } 
    public CricketTournamentDetails saveCricketTournamentDetails(CricketTournamentDetails cricketTournamentDetails){
        CricketTournamentDetails _cricketTournamentDetails = new CricketTournamentDetails(
            UUID.randomUUID().toString(),
            cricketTournamentDetails.getName(),
            cricketTournamentDetails.getStartDate(),
            cricketTournamentDetails.getEndDate(),
            cricketTournamentDetails.getMatches()
        );
        return cricketTournamentDetailsRepository.save(_cricketTournamentDetails);
    }
}
