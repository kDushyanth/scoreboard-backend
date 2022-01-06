package com.dush.gamesiitbbs.football.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FootballPlayerScore {
    private String name;
    private List<String> goals;
}
