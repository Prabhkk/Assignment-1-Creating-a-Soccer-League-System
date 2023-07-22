import java.util.Random;

public class GamePlay {

    private Random random = new Random();

    /**
     * Simulate a game between two teams and update their scores.
     * @param team1 first team.
     * @param team2 second team.
     */
    public void playGame(Team team1, Team team2) {
        int team1Score = random.nextInt(5); // Random score for team 1.
        int team2Score = random.nextInt(5); // Random score for team 2.

        // Update the team scores.
        team1.updateScore(team1Score);
        team2.updateScore(team2Score);
    }
}
