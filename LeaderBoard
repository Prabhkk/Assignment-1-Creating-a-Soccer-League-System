import java.util.Arrays;

public class LeaderBoard {

    private Team[] teams; // Array to store all teams.

    /**
     * Constructor for LeaderBoard.
     * @param teams array of all teams.
     */
    public LeaderBoard(Team[] teams) {
        this.teams = teams;
    }

    /**
     * Print the leaderboard.
     */
    public void printLeaderBoard() {
        // Sort the teams in descending order of scores.
        Arrays.sort(teams, (team1, team2) -> team2.getScore() - team1.getScore());

        System.out.println("Leaderboard:");
        for (Team team : teams) {
            System.out.println("Team " + team.getName() + ": " + team.getScore() + " points");
        }
    }
}
