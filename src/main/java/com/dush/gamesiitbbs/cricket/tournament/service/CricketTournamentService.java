package com.dush.gamesiitbbs.cricket.tournament.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.dush.gamesiitbbs.cricket.tournament.model.CricketTournament;
import com.dush.gamesiitbbs.cricket.tournament.repository.CricketTournamentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CricketTournamentService {
    
    @Autowired
    private CricketTournamentRepository cricketTournamentRepository;

    public CricketTournament saveCricketTournament(CricketTournament cricketTournament){
        //cricketTournament.toString();
        
        return cricketTournamentRepository.save(new CricketTournament(
            UUID.randomUUID().toString(),
            cricketTournament.getName(),
            cricketTournament.getStartDate(),
            cricketTournament.getEndDate()
        ));
    }
    public Optional<CricketTournament> findCricketTournamentById(String id){
        return cricketTournamentRepository.findById(id);
    }
    public List<CricketTournament> findAllCricketTournaments(){
        List<CricketTournament> _cricketTournaments = new ArrayList<>();
        cricketTournamentRepository.findAll().forEach(_cricketTournament -> _cricketTournaments.add(_cricketTournament));
        return _cricketTournaments;
    }
}
