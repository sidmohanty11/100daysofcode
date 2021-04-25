package com.codewithsid;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FootballPlayer cristiano = new FootballPlayer("CristianoRonaldo");
        FootballPlayer neymar = new FootballPlayer("Neymar");
        FootballPlayer messi = new FootballPlayer("Messi");
        FootballPlayer beckham = new FootballPlayer("Beckham");
        FootballPlayer marcelo = new FootballPlayer("Marcelo");
        FootballPlayer pique = new FootballPlayer("Pique");


        Team<FootballPlayer> op = new Team<>("OP TEAM");
        op.addPlayers(cristiano);
        op.addPlayers(neymar);
        op.addPlayers(marcelo);

        Team<FootballPlayer> gp = new Team<>("GP TEAM");
        op.addPlayers(beckham);
        op.addPlayers(pique);
        op.addPlayers(messi);

        op.matchScore(gp,2,3);
        op.matchScore(gp,2,3);
        op.matchScore(gp,2,3);
        op.matchScore(gp,3,3);
        op.matchScore(gp,4,3);

        System.out.println(op.ranking());
        System.out.println(gp.ranking());

        League leagueTable = new League();
        leagueTable.addTeams(op);
        leagueTable.addTeams(gp);
        leagueTable.leagueSorting();
    }
}
