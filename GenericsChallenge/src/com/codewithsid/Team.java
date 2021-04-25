package com.codewithsid;

import java.util.ArrayList;

public class Team<T> implements Comparable<Team> {
    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;

    private ArrayList<FootballPlayer> members = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void addPlayers(FootballPlayer player){
        members.add(player);
    }

    public int ranking(){
        return (won*2) + tied;
    }

    public Team(String name) {
        this.name = name;
    }

    public void matchScore(Team<T> opponent, int ourScore, int theirScore){
            played++;
            if (ourScore > theirScore){
                won++;
            }else if (ourScore == theirScore){
                tied++;
            }
            else {
                lost++;
            }
        if(opponent != null) {
            System.out.println(this.getName() +" vs "+ opponent.getName());
            opponent.matchScore(null, theirScore, ourScore);
        }
    }

    @Override
    public int compareTo(Team team) {
        return Integer.compare(team.ranking(),this.ranking());
    }
}
