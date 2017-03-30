package DotComGame;

import java.util.ArrayList;

/**
 * Created by Maksym_Huz on 07.03.2017.
 */
public class DotCom {

    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {

        String result = "miss";

        // if user guess is not in the ArrayList index, then indexOf() returns  a -1
        int index = locationCells.indexOf(userInput);

            if (index >= 0) {

                locationCells.remove(index);

                if (locationCells.isEmpty()) {
                    result = "kill";
                } else {
                    result = "hit";
                }

            }

        return result;
    }
}
