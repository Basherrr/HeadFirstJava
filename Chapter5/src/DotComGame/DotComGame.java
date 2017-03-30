package DotComGame;

/**
 * Created by Maksym_Huz on 15.03.2017.
 */
public class DotComGame {
    public static void main (String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotComGame theDotCom = new DotComGame();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}

