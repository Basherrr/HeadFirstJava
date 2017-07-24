import java.util.*;

// Created 22.07.2017 by Maksym Huz

public class ArrayListMagnet {

    public static void printAl(ArrayList<String> al) {

        ArrayList<String> a = new ArrayList<String>();

        a.add{0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printAl(a);

        a.remove(2);
        if (a.containts("two")) {
            a.add("2.2");
        }
        if (a.contains("three")) {
            a.add("four");
        }
        printAl(a);

        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAl(a);
        printAl(a);
    }

    public static void main (String[] args) {

        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}