import java.util.*;

/**
 * Created by Maksym_Huz on 30.03.2017.
 */
public class DotComBust {

    // declare and initialize the variables we'll need
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // first make some dot coms and give them locations
        // make three DotCom objects, give 'em names, and stick 'em in the ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        // print brief instructions for user
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        // repeat with each DotCom in the list
        for (DotCom dotComToSet : dotComList) {
            // ask the helper for a DotCom location
            ArrayList<String> newLocation = helper.placeDotCom(3);
            // call the setter method on this DotCom to give it the location you just got from the helper
            dotComToSet.setLocationCells(newLocation);
        } // close for loop
    } // close setUpGame method

    private void startPlaying() {
        // as long as the DotCom list is NOT empty
        while(!dotComList.isEmpty()) {
            // get user input
            String userGuess = helper.getUserInput("Enter a guess");
            // call our own checkUserGuess method
            checkUserGuess(userGuess);
        }

        // call our own finishGame method
        finishGame();
    }

    private void checkUserGuess (String userGuess) {

        // increment the number of guesses the user has made
        numOfGuesses++;
        // assume it's a 'miss', unless told otherwise
        String result = "miss";

        // repeat with all DotComs in the list
        for (DotCom dotComToTest : dotComList) {
            // ask the DotCom to check the user guess, looking for a hit (or kill)
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                // get out of the loop early, no point in testing the others
                break;
            }
            if (result.equals("kill")) {
                // this guy's dead, so take him out of the DotComs list then get out of the loop
                dotComList.remove(dotComToTest);
                break;
            }
        }
        // print the result for the user
        System.out.println(result);
    }

    private void finishGame() {
        // print a message telling the user how de did in the game
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main (String[] args) {
        // create the game object
        DotComBust game = new DotComBust();
        // tell the game object to set up the game
        game.setUpGame();
        // tell the game object to start the main game play loop (keeps asking for user input and checking the guess
        game.startPlaying();
    }
}