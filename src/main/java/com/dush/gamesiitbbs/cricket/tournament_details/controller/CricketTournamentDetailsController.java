package com.dush.gamesiitbbs.cricket.tournament_details.controller;

import java.util.Optional;

import com.dush.gamesiitbbs.cricket.tournament_details.model.CricketTournamentDetails;
import com.dush.gamesiitbbs.cricket.tournament_details.service.CricketTournamentDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketTournamentDetailsController {
    @Autowired
    CricketTournamentDetailsService cricketTournamentDetailsService;

    @GetMapping("/api/cricket-tournament-details/{tournament-id}")
    public ResponseEntity<CricketTournamentDetails> getCricketTournamentDetailsById(@PathVariable("tournament-id") String id){
        Optional<CricketTournamentDetails> fOptional = cricketTournamentDetailsService.findCricketTournamentDetailsById(id);
        return fOptional.map(cricketTournamentDetails ->  new ResponseEntity<CricketTournamentDetails>(cricketTournamentDetails,HttpStatus.OK))
                        .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/api/cricket-tournament-details/")
    public ResponseEntity<CricketTournamentDetails> addCricketTournamentDetails(@RequestBody CricketTournamentDetails cricketTournamentDetails){
        CricketTournamentDetails _cricketTournamentDetails =  cricketTournamentDetailsService.saveCricketTournamentDetails(cricketTournamentDetails);
        return new ResponseEntity<CricketTournamentDetails>(_cricketTournamentDetails,HttpStatus.CREATED);
    }
}
