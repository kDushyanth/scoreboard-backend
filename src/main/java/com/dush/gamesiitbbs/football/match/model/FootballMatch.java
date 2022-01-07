package com.dush.gamesiitbbs.football.match.model;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("football_mactch")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FootballMatch {
    private String id;
    private String name;
    private int number;
    private String tournamentId;
    private String tournamentName;
    private LocalDate date;
    private String team1Name;
    private String team2Name;
    private String team1Goals;
    private String team2Goals;
}
