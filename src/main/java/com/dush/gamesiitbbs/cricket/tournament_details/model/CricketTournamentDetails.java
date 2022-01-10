package com.dush.gamesiitbbs.cricket.tournament_details.model;

import java.time.LocalDate;
import java.util.List;

import com.dush.gamesiitbbs.cricket.match.model.CricketMatch;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("cricket_tournament_details")
public class CricketTournamentDetails {
    @Id
    private String id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    List<CricketMatch> matches;
}
