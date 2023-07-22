import java.util.Random;
import java.util.Arrays;

/**
 * Main class representing the soccer league system.
 * This is the entry point of the program.
 */
public class SoccerLeagueSystem {

    public static void main(String[] args) {
        // Initialize six teams.
        Team[] teams = {
            new Team("Team 1"),
            new Team("Team 2"),
            new Team("Team 3"),
            new Team("Team 4"),
            new Team("Team 5"),
            new Team("Team 6")
        };

        // Initialize game play.
        GamePlay gamePlay = new GamePlay();

        // Play games between all teams.
        for (int i = 0; i < teams.length; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                gamePlay.playGame(teams[i], teams[j]);
            }
        }

        // Initialize leaderboard and print it.
        LeaderBoard leaderboard = new LeaderBoard(teams);
        leaderboard.printLeaderBoard();
    }
}
