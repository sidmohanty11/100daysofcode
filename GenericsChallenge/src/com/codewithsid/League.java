package com.codewithsid;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private ArrayList<Team<FootballPlayer>> teams = new ArrayList<>();

    public void leagueSorting() {
        for (int i = 0;i<teams.size();i++){
            Collections.sort(teams);
        }
        for (Team<FootballPlayer> team : teams) {
            System.out.println(team.getName() + " : " + team.ranking());
        }
    }

    public void addTeams(Team<FootballPlayer> team) {
        teams.add(team);
    }
}
