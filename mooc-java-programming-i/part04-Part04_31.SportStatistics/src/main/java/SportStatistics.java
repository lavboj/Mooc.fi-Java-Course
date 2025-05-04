
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gameCounter = 0;
        int victoryCounter = 0;
        int lossesCounter = 0;

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList <Game> games = readFromFile(file);
        for (Game game : games) {
            if (game.getHomeTeam().equals(team)) {
                gameCounter++;
            }else if (game.getOppositeTeam().equals(team)) {
                gameCounter++;
            }
            if (game.getWinner().equals(team)) {
                victoryCounter++;
            }else if (game.getLooser().equals(team)) {
                lossesCounter++;   
            }
        }
        System.out.println("Games: " + gameCounter);
        System.out.println("Wins: " + victoryCounter);
        System.out.println("Losses: " + lossesCounter);
    }

    public static ArrayList<Game> readFromFile(String file) {
        ArrayList <Game> game = new ArrayList<>();
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String [] parts = line.split(",");
                game.add(new Game(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3])));
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return game;
    }

}
