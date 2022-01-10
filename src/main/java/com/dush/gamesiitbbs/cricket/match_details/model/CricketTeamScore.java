package com.dush.gamesiitbbs.cricket.match_details.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CricketTeamScore {
    private String name;
    private int goals;
    private List<CricketPlayerScore> cricketPlayerScores;
}
