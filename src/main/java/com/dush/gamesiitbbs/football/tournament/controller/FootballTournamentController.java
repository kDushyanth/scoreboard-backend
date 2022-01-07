package com.dush.gamesiitbbs.football.tournament.controller;

import java.util.List;
import java.util.Optional;


import com.dush.gamesiitbbs.football.tournament.model.FootballTournament;
import com.dush.gamesiitbbs.football.tournament.service.FootballTournamentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FootballTournamentController {

    @Autowired
    FootballTournamentService footballTournamentService;

    @GetMapping("/api/football-tournaments/{tournament-id}")
    public ResponseEntity<FootballTournament> getFootballTournamentById(@PathVariable("tournament-id") String id){
        Optional<FootballTournament> _footballTournament = footballTournamentService.findFootballTournamentById(id); 
        return _footballTournament.map(tournament -> ResponseEntity.ok().body(tournament))
                                  .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/api/football-tournaments/")
    public ResponseEntity<List<FootballTournament>> getAllFootballTournaments(){
        List<FootballTournament> footballTournaments = footballTournamentService.findAllFootballTournaments();
        return new ResponseEntity<List<FootballTournament>>(footballTournaments,HttpStatus.OK);
    }
}
