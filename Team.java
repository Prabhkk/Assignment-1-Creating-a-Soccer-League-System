public class Team {

    private String name; // Name of the team.
    private int score; // Score of the team.

    /**
     * Constructor for Team.
     * @param name name of the team.
     */
    public Team(String name) {
        this.name = name;
        this.score = 0; // Default score is 0.
    }

    /**
     * Get the name of the team.
     * @return name of the team.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the score of the team.
     * @return score of the team.
     */
    public int getScore() {
        return score;
    }

    /**
     * Update the score of the team.
     * @param score new score to be added.
     */
    public void updateScore(int score) {
        this.score += score;
    }
}
