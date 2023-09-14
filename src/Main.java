import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Create our arraylist to store scores
        ArrayList<Integer> scoreboard = new ArrayList<>();

        //Create variables etc.
        String input = "";
        int insertThisPoint = 0;
        Boolean continueProgram = true;

        //Input data and store it.
        while (continueProgram){

            //Menu choice 1
            storePoints(input, insertThisPoint, scoreboard);

            //Run exit loop function
            System.out.println("Vill du avsluta? j/n");
            continueProgram = exit();
        }
    }

    static boolean inputScore (String input){

        if (checkIfnumber(input)){
            return true;
        }
        else {
            System.out.println("Bara siffror tack");
            return false;
        }

    }
    static void insertPoints(int points, ArrayList<Integer> scoreboard){

        scoreboard.add(points);

        System.out.println("-- Scoreboard --");
        for(int point : scoreboard){
            System.out.println(point);
        }
        System.out.println("-----------------");

    }
    static void storePoints(String input, int insertThisPoint, ArrayList<Integer> scoreboard){

        if(input.equals("")) {
            System.out.println("Skriv in poängen: ");
        }
        input = scanner.nextLine();

        //Check if entered score is a digit or not
        while (!inputScore(input)){
            System.out.println("Du måste skriva in ett giltigt tal, prova igen:");
            input = scanner.nextLine();
        }

        //Insert points to arraylist
        insertThisPoint = Integer.parseInt(input);
        insertPoints(insertThisPoint, scoreboard);


    }
    static void calcHighestPoint(){


    }
    static int calcAveragePoint(){

        return 0;
    }
    static void showResult(){

    }
    static boolean checkIfnumber(String input) {

        //Check if string is only digits
        if (!input.matches("\\d*")){
            return false;
        }
        else {
            return true;
        }
    }
    static boolean exit(){

        Boolean continueProgramInThisFunction;
        String choice = scanner.nextLine();

        if (choice.equals("j")){
            continueProgramInThisFunction = false;
        }
        else {

            continueProgramInThisFunction = true;
            System.out.println("Skriv in nästa poäng:");
            //String input = scanner.nextLine();
        }

        return continueProgramInThisFunction;
    }
}