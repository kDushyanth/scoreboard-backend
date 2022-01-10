package com.dush.gamesiitbbs.cricket.match.controller;

import java.util.Optional;

import com.dush.gamesiitbbs.cricket.match.model.CricketMatch;
import com.dush.gamesiitbbs.cricket.match.service.CricketMatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CricketMatchController {
    @Autowired
    CricketMatchService cricketMatchService;

    @GetMapping("/api/cricket-matches/{match-id}")
    public ResponseEntity<CricketMatch> findCricketMatchById(@PathVariable("match-id") String id){
        Optional<CricketMatch> fOptional = cricketMatchService.findCricketMatchById(id);
        return fOptional.map(cricketMatch -> ResponseEntity.ok().body(cricketMatch))
                 .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/api/cricket-matches")
    public ResponseEntity<CricketMatch> postMethodName(@RequestBody CricketMatch cricketMatch) {
        cricketMatch.toString();
        System.out.println("\n\n\n\\");
        CricketMatch _CricketMatch = cricketMatchService.addCricketMatch(cricketMatch);
        return ResponseEntity.status(HttpStatus.CREATED).body(_CricketMatch);
    }
    
}
