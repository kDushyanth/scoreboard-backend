package com.dush.gamesiitbbs.football.tournament_details.controller;

import java.util.Optional;

import com.dush.gamesiitbbs.football.tournament_details.model.FootballTournamentDetails;
import com.dush.gamesiitbbs.football.tournament_details.service.FootballTournamentDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballTournamentDetailsController {
    @Autowired
    FootballTournamentDetailsService footballTournamentDetailsService;

    @GetMapping("/api/football-tournament-details/{tournament-id}")
    public ResponseEntity<FootballTournamentDetails> getFootballTournamentDetailsById(@PathVariable String id){
        Optional<FootballTournamentDetails> fOptional = footballTournamentDetailsService.findFootballTournamentDetailsById(id);
        return fOptional.map(footballTournamentDetails ->  new ResponseEntity<FootballTournamentDetails>(footballTournamentDetails,HttpStatus.OK))
                        .orElse(ResponseEntity.notFound().build());
    }
}
