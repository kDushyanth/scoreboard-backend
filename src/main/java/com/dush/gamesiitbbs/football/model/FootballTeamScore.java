package com.dush.gamesiitbbs.football.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class FootballTeamScore {
    private String name;
    private int goals;
    private List<FootballPlayerScore> footballPlayerScores;
}
