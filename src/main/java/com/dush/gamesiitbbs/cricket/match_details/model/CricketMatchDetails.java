package com.dush.gamesiitbbs.cricket.match_details.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("cricket_match_details")
public class CricketMatchDetails {
    @Id
    private String id;
    private int number;
    private String tournamentId;
    private String tournamentName;
    private LocalDate date;
    private List<CricketTeamScore> cricketTeamScores;
}
