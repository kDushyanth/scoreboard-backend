package com.dush.gamesiitbbs.football.match.controller;

import java.util.Optional;

import javax.annotation.PostConstruct;

import com.dush.gamesiitbbs.football.match.model.FootballMatch;
import com.dush.gamesiitbbs.football.match.service.FootballMatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class FootballMatchController {
    @Autowired
    FootballMatchService footballMatchService;

    @GetMapping("/api/football-matches/{match-id}")
    public ResponseEntity<FootballMatch> findFootballMatchById(@PathVariable("match-id") String id){
        Optional<FootballMatch> fOptional = footballMatchService.findFootballMatchById(id);
        return fOptional.map(footballMatch -> ResponseEntity.ok().body(footballMatch))
                 .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/api/football-matches")
    public ResponseEntity<FootballMatch> postMethodName(@RequestBody FootballMatch footballMatch) {
        footballMatch.toString();
        System.out.println("\n\n\n\\");
        FootballMatch _FootballMatch = footballMatchService.addFootballMatch(footballMatch);
        return ResponseEntity.status(HttpStatus.CREATED).body(_FootballMatch);
    }
    
}
