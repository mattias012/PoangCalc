import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> scoreboard = new ArrayList<>();

        String input = "";
        int insertThisPoint = 0;
        Boolean continueProgram = true;

        while (continueProgram){

            if(input.equals("")) {
                System.out.println("Skriv in poängen: ");
            }
            input = scanner.nextLine();

            //while-loop?
            while (!inputScore(input)){
                System.out.println("Du måste skriva in ett giltigt tal, prova igen:");
                input = scanner.nextLine();
            }

            //Insert points to arraylist
            insertThisPoint = Integer.parseInt(input);
            insertPoints(insertThisPoint, scoreboard);

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

    }
    static void storePoints(){

    }
    static int calcHighestPoint(){

        return 0;
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