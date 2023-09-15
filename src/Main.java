import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final int EXIT_PROGRAM = 4;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Create our arraylist to store scores
        ArrayList<Integer> scoreboard = new ArrayList<>();

        //Initialize variables etc.
        String input = "";
        int insertThisPoint = 0;
        Boolean continueProgram = true;

        //Set menu choice and display menu.
        int menuChoice = menu();

        //Input data and store it.
        while (continueProgram) {

            //Menu choice 1
            if (menuChoice == 1) {
                storePoints(input, insertThisPoint, scoreboard);

                menuChoice = menu();
            }
            //menu choice 2
            else if (menuChoice == 2) {
                double result = calcAveragePoint(scoreboard);
                System.out.println(result);

                menuChoice = menu();
            } else if (menuChoice == 3) {
                calcHighestPoint();

                menuChoice = menu();
            } else if (menuChoice == 4) {
                continueProgram = false;
            } else {

            }
        }
        System.out.println("Programmet avslutas!");
    }

    static int menu() {

        //default is 0, run again.
        int menuChoice = 0;

        System.out.println();
        System.out.println("Välj vad du vill göra: \n" +
                "1. Lägg till poäng\n" +
                "2. Se medelpoäng\n" +
                "3. Se highscore\n" +
                "4. Avsluta programmet");

        String choice = scanner.nextLine();

        if (checkIfnumber(choice)) {
            menuChoice = Integer.parseInt(choice);

            if (menuChoice == 1 || menuChoice == 2 || menuChoice == 3) {
                menuChoice = Integer.parseInt(choice);
            } else {
                menuChoice = EXIT_PROGRAM;
            }
        }
        return menuChoice;
    }

    static boolean inputScore(String input) {

        if (checkIfnumber(input)) {
            return true;
        } else {
            System.out.println("Bara siffror tack");
            return false;
        }
    }

    static void insertPoints(int points, ArrayList<Integer> scoreboard) {

        //add score
        scoreboard.add(points);

        System.out.println("-- Scoreboard --");
        for (int point : scoreboard) {
            System.out.println(point);
        }
        System.out.println("-----------------");

    }

    static void storePoints(String input, int insertThisPoint, ArrayList<Integer> scoreboard) {

        if (input.equals("")) {
            System.out.println("Skriv in poängen: ");
        }
        input = scanner.nextLine();

        //Check if entered score is a digit or not
        while (!inputScore(input)) {
            System.out.println("Du måste skriva in ett giltigt tal, prova igen:");
            input = scanner.nextLine();
        }

        //Insert points to arraylist
        insertThisPoint = Integer.parseInt(input);
        insertPoints(insertThisPoint, scoreboard);

    }

    static void calcHighestPoint() {


    }

    static double calcAveragePoint(ArrayList<Integer> scoreboard) {

        double sum = 0;
        double average = 0;
        double numerOfParticipants = scoreboard.size();

        for (int points : scoreboard) {
            sum = sum + points;
        }

        average = (sum/numerOfParticipants);

        return average;
    }

    static void showResult() {

    }

    static boolean checkIfnumber(String input) {

        //Check if string is only digits
        if (!input.matches("\\d*")) {
            return false;
        } else {
            return true;
        }
    }
}