import java.util.ArrayList;
import java.util.List;
/**
 * 作業編號：Lab3
 * 作業內容：實作Player Class, Team Class
 * @author 411177031
 * @version 1.0
 */
public class LAB3 {
    public static void main(String[] args) {
        // Create players
        Player player1 = new Player("Chen Jie-Xian", "Outfielders", 24);
        Player player2 = new Player("Lin Yu-Min", "Pitchers", 45);
        Player player3 = new Player("Lin Chia-Cheng", "Catchers", 27);

        // Create a team
        Team team = new Team("Team Taiwan");

        // Add players to the team
        team.addPlayer(player1);
        team.addPlayer(player2);

        // Test getPlayerInfo method
        System.out.println(team.getPlayerInfo(24)); // Output: Chen Jie-Xian (Outfielders) - 24
        System.out.println(team.getPlayerInfo(45)); // Output: Lin Yu-Min (Pitchers) - 45
        System.out.println(team.getPlayerInfo(27)); // Output: Player not found.
    }
}

class Player {
    private String name;
    private String position;
    private int number;

    // Constructor
    public Player(String name, String position, int number) {
        this.name = name;
        this.position = position;
        this.number = number;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }
}

class Team {
    private String name;
    private List<Player> players;

    // Constructor
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // Add a player to the team
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Get player info by jersey number
    public String getPlayerInfo(int number) {
        for (Player player : players) {
            if (player.getNumber() == number) {
                return player.getName() + " (" + player.getPosition() + ") - " + player.getNumber();
            }
        }
        return "Player not found.";
    }
}