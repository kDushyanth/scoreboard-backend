package com.dush.gamesiitbbs.football.match.service;

import java.util.Optional;

import com.dush.gamesiitbbs.football.match.model.FootballMatch;
import com.dush.gamesiitbbs.football.match.repository.FootballMatchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballMatchService{
    @Autowired
    FootballMatchRepository footballMatchRepository;
    public Optional<FootballMatch> findFootballMatchById(String id){
        return footballMatchRepository.findById(id);
    }
}
