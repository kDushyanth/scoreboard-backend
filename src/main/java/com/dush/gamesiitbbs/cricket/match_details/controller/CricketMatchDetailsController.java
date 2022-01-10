package com.dush.gamesiitbbs.cricket.match_details.controller;

import java.util.Optional;

import com.dush.gamesiitbbs.cricket.match_details.model.CricketMatchDetails;
import com.dush.gamesiitbbs.cricket.match_details.service.CricketMatchDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketMatchDetailsController {

    @Autowired
    CricketMatchDetailsService cricketMatchService;

    @GetMapping("/api/cricket-match-details/{match-id}")
    public ResponseEntity<CricketMatchDetails> getCricketMatchById(@PathVariable("match-id") String matchId){
        Optional<CricketMatchDetails> _cricketMatch = cricketMatchService.findCricketMatchById(matchId);
        return _cricketMatch.map(match -> ResponseEntity.ok().body(match))
                             .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/api/cricket-match-details/")
    public ResponseEntity<CricketMatchDetails> saveCricketMatch(@RequestBody CricketMatchDetails cricketMatch){
        CricketMatchDetails _cricketMatch = cricketMatchService.saveCricketMatch(cricketMatch);
        return new ResponseEntity<CricketMatchDetails>(_cricketMatch,HttpStatus.CREATED);
    }

}
