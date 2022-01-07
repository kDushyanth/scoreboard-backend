package com.dush.gamesiitbbs.football.match_details.controller;

import java.util.Optional;

import com.dush.gamesiitbbs.football.match_details.model.FootballMatch;
import com.dush.gamesiitbbs.football.match_details.service.FootballMatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballMatchController {

    @Autowired
    FootballMatchService footballMatchService;

    @GetMapping("/api/football-match-details/{match-id}")
    public ResponseEntity<FootballMatch> getFootballMatchById(@PathVariable("match-id") String matchId){
        Optional<FootballMatch> _footballMatch = footballMatchService.findFootballMatchById(matchId);
        return _footballMatch.map(match -> ResponseEntity.ok().body(match))
                             .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/api/football-matches-details/")
    public ResponseEntity<FootballMatch> saveFootballMatch(@RequestBody FootballMatch footballMatch){
        FootballMatch _footballMatch = footballMatchService.saveFootballMatch(footballMatch);
        return new ResponseEntity<FootballMatch>(_footballMatch,HttpStatus.CREATED);
    }

}
