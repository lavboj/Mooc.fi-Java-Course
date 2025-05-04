public class Game {
    private String homeTeam;
    private String oppositeTeam;
    private int homeScore;
    private int oppositeScore;

    public Game(String homeTeam, String oppositeTeam, int homeScore, int oppositeScore) {
        this.homeTeam = homeTeam;
        this.homeScore = homeScore;
        this.oppositeTeam = oppositeTeam;
        this.oppositeScore = oppositeScore;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getOppositeTeam() {
        return this.oppositeTeam;
    }

    public String getWinner() {
        if (this.homeScore > this.oppositeScore) {
            return this.homeTeam;
        }else {
            return this.oppositeTeam;
        }
    }

    public String getLooser() {
        if (this.homeScore < this.oppositeScore) {
            return this.homeTeam;
        }else {
            return this.oppositeTeam;
        }
    }
}
