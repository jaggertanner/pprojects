package PicoloClone;
// 2023 Jagger Tanner

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * System functionality/rough UI
 * @author Jagger
 */
public class PicoloClone {

    public static final String formatStars = "******************************************************************************************";
    public static final String formatGap = "*                                                                                        *";
    public static Scanner keyboard = new Scanner(System.in);

    public QuestionList questionList = QuestionList.getInstance();
    public static ArrayList<String> players = new ArrayList<String>();
    public static void main(String[] args) {
        run();
    }
    
    /**
     * Proceeds through program
     */
    public static void run() {
        int choice = displayMenu();
        switch(choice) {
            case 1:
                playGame();
                break;
            case 2:
                addQuestions();
                break;
            case 3:
                quit();
                break;   
        }
    }

    /**
     * Formats a string by inserting indents in front
     * @param phrase The phrase to be formatted
     * @return The formatted phrase
     */
    public static String format(String phrase) {
        return "\t\t" + "phrase";
    }
    /**
     * Clears the console
     */
    public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }

    /**
     * Displays initial user options
     * @return int representing user selection
     */
    public static int displayMenu() {
        clearScreen();
        System.out.println(formatStars + "\n" + formatGap + "\n" + formatGap + "\n" + formatGap + 
        "\n*" + format("1) Play game") + "\n*" + format("2) Add questions") + "\n" + format("3) Quit") );
        int choice = keyboard.nextInt();
        clearScreen();
        switch(choice) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                System.out.println("That choice is not supported;");
                return 3;
        }
    }

    // Option 1 leads here
    /**
     * Populates Question ArrayList, determines players
     */
    public static void initialize() {
        String[] questions = new String[45];
        int[] indices = getRand(0, QuestionList.getLength());
        // Create ArrayList of 45 random Questions
        for (int i = 0; i < questions.length; i++) {
            
        }

        playGame();
        return;
    }
    /**
     * Proceeds through game
     */
    public static void playGame() {
        players = populatePlayers();
        initialize();
        return;
    }
    
    public static ArrayList<String> populatePlayers() {
        ArrayList<String> populate = new ArrayList<String>(); // To be returned
        boolean loop = true;
        while (loop) {
            clearScreen();
            System.out.println("Enter player names one by one\nEnter \"done\" when done\n\n\n");
            for(String player: populate) {
                System.out.println("- " + player);
            }
            System.out.println("");
            String entry = keyboard.nextLine()
            if (!(entry.equalsIgnoreCase("done")))
                players.add(entry);
            else
                loop = false;
        }
        clearScreen();
        return populate;
    }

    // Option 2 leads here
    /**
     * Allows user to add new questions to the list from within the UI
     */
    public static void addQuestions() {
        return;
    }

    public static int getRand(int low, int high) {
        Random rand = new Random();
        int r = rand.nextInt(high - low);
        return r += low;

    }

    // Option 3 leads here
    /**
     * Ends program
     */
    public static void quit() {
        System.out.println("Quitting game...");
        System.exit(0);
    }
}