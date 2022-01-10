package com.dush.gamesiitbbs.cricket.tournament.controller;

import java.util.List;
import java.util.Optional;

import com.dush.gamesiitbbs.cricket.tournament.model.CricketTournament;
import com.dush.gamesiitbbs.cricket.tournament.service.CricketTournamentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CricketTournamentController {

    @Autowired
    CricketTournamentService cricketTournamentService;

    @GetMapping("/api/cricket-tournaments/{tournament-id}")
    public ResponseEntity<CricketTournament> getCricketTournamentById(@PathVariable("tournament-id") String id){
        Optional<CricketTournament> _cricketTournament = cricketTournamentService.findCricketTournamentById(id); 
        return _cricketTournament.map(tournament -> ResponseEntity.ok().body(tournament))
                                  .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/api/cricket-tournaments/")
    public ResponseEntity<List<CricketTournament>> getAllCricketTournaments(){
        List<CricketTournament> cricketTournaments = cricketTournamentService.findAllCricketTournaments();
        return new ResponseEntity<List<CricketTournament>>(cricketTournaments,HttpStatus.OK);
    }
    @PostMapping("/api/cricket-tournaments/")
    public ResponseEntity<CricketTournament> saveCricketTournament(@RequestBody CricketTournament cricketTournament){
        CricketTournament _cricketTournament = cricketTournamentService.saveCricketTournament(cricketTournament);
        return new ResponseEntity<CricketTournament>(_cricketTournament,HttpStatus.CREATED);
    }
    
}
