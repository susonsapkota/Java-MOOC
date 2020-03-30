
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class Team {

    private String team;
    private int maxSize;
    private ArrayList<Player> player;

    public Team(String team) {
        this.team = team;
        this.maxSize = 16;
        this.player = new ArrayList<Player>();

    }

    public String getTeam() {
        return team;
    }

    public void addPlayer(Player player) {
        if (this.player.size() < this.maxSize) {
            this.player.add(player);
        }

    }

    public void printPlayers() {
        for (Player players : this.player) {
            System.out.println(players.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return player.size();
    }

    public int goals() {
        int goal = 0;
        for (Player players : this.player) {
            goal += players.goals();
        }
        return goal;
    }

    public String getName() {
        return this.team;
    }

}
