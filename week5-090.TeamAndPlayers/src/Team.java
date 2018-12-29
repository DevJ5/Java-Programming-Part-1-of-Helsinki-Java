import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public void addPlayer(Player player) {
        if(players.size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        String toString = "";
        for(Player player : this.players) {
            toString += player +"\n";
        }
        System.out.println(toString);
    }

    public int size(){
        return this.players.size();
    }

    public int goals() {
        int goals = 0;
        for(Player player : this.players) {
            goals += player.goals();
        }
        return goals;
    }


    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
