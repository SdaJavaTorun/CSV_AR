package com.sdajava.javaioproblems;


// taka klasa to obiekt POJO
public class Player {

    public int yearID;
    private String teamID;
    private String lgID;
    private String playerID;
    private int salary;

    public Player(int yearID, String teamID, String lgID, String playerID, int salary) {
        this.yearID = yearID;
        this.teamID = teamID;
        this.lgID = lgID;
        this.playerID = playerID;
        this.salary = salary;
    }
}
