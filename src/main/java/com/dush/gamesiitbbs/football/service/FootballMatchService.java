package com.dush.gamesiitbbs.football.service;

import java.util.Optional;

import com.dush.gamesiitbbs.football.model.FootballMatch;
import com.dush.gamesiitbbs.football.repository.FootballMatchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballMatchService {
    
    @Autowired
    private FootballMatchRepository footballMatchRepository;
    public FootballMatch saveFootballMatch(FootballMatch footballMatch){
        return footballMatchRepository.save(footballMatch);
    }
    public Optional<FootballMatch> findFootballMatchById(String id){
        return footballMatchRepository.findById(id);
    }
}
