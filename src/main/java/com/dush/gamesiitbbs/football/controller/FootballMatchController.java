package com.dush.gamesiitbbs.football.controller;

import java.util.Optional;

import com.dush.gamesiitbbs.football.model.FootballMatch;
import com.dush.gamesiitbbs.football.service.FootballMatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballMatchController {

    @Autowired
    FootballMatchService footballMatchService;

    @GetMapping("/api/football-matches/{match-id}")
    public ResponseEntity<FootballMatch> getFootballMatchById(@PathVariable("match-id") String matchId){
        Optional<FootballMatch> _footballMatch = footballMatchService.findFootballMatchById(matchId);
        return _footballMatch.map(match -> ResponseEntity.ok().body(match))
                             .orElse(ResponseEntity.notFound().build());
    }

}
