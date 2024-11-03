package classesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String city;
    private String division;
    private List<Player> players;

    public Team(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
        this.players = new ArrayList<>();
    }

    public void playGame() {
        System.out.println("Team : " + this.name + " is playing!");
    }

    public void hireCoach() {

    }

    public void addPlayers(Player player) {
        players.add(player);
    }

    public void playersList() {
        for (Player p : players) {
            System.out.println("------------------------");
            System.out.println("Name : " + p.getName() + " \n" +
                            "Position : " + p.getPosition() + " \n" +
                            "Jersey numebr : " + p.getJerseyNumber());
        }
        System.out.println("------------------------");
    }
}

class Player {
    private String name;
    private String position;
    private int jerseyNumber;

    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void playGame() {

    }

    public void train() {

    }

}

class Demo {
    public static void main(String[] args) {
        Team everGreen = new Team("everGreen", "Chennai", "State");
        Player thiru = new Player("Thiru", "Goal keeper", 33);
        everGreen.addPlayers(thiru);

        everGreen.playersList();
        everGreen.playGame();
    }
}
