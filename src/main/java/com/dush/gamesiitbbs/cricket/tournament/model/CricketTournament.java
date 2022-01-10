package com.dush.gamesiitbbs.cricket.tournament.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("cricket_tournaments")
public class CricketTournament {
    @Id
    private String id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
}
