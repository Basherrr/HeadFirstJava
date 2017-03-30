/**
 * Created by Maksym_Huz on 03.03.2017.
 */
public class SharpenYourPencil {

    public static int calcArea(int height, int width) {
        return height * width;
    }

    public static void main(String[] args) {
        int a = calcArea(7, 12);
        short c = 7;
        calcArea(c, 15);
        calcArea(2, 3);
    }
}