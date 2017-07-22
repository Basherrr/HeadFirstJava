import java.util.ArrayList;

/**
 * Created by Maksym_Huz on 31.03.2017.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        // return ArrayList location of user guess, otherwise -1
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            // delete an entry
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "   : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
