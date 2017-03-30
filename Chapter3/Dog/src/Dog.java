/**
 * Created by Maksym_Huz on 27.02.2017.
 */
class Dog {
    String name;
    public static void main (String[] args) {
        // create Dog object
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // create Dog array
        Dog[] myDogs = new Dog[3];
        // declare dogs
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // access dogs using array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // print out myDogs[2] name
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        // all dogs barks
        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }
}