// Inheritance is a process where one class acquires the properties (methods and
// attributes) of another. With the use of inheritance, the information is made
// manageable in a hierarchical order.

// subclass (child) - the class that inherits from another class
// superclass (parent) - the class being inherited from

// To inherit from a class, use the "extends" keyword.

// let's say we have a class of Human. a human will have a name,age height ,
// weight and other properties

class Main {
    public static void main(String[] args) {
        // creating a female
        Female myGurl = new Female("charlie", 3, 20);
        // we can acces all her properties
        System.out.println("the girl's name is :" + myGurl.name + "she is " + myGurl.age + "years old" + "wombsize is "
                + myGurl.wombSize);

        // a girl still behaves like a Human
        myGurl.eat();
        myGurl.sleep();
        myGurl.walk();
        myGurl.talk();
        // a girl can do more
        myGurl.concieve();
        myGurl.giveBirth();

        // creating a male
        Male myGuy = new Male("micheal", 2);
        System.out.println("the guy's name is :" + myGuy.name + "he is " + myGuy.age + "years old");

        // a guy still behaves like a Human
        myGuy.eat();
        myGuy.sleep();
        myGuy.walk();
        myGuy.talk();
        // a guy can also do more
        myGuy.cannotConcieve();
        myGuy.cannotGiveBirth();

    }
}

class Human {
    String name;
    int age;

    // defining a constructor for Humans
    Human(String n, int a) {
        name = n;
        age = a;
        System.out.println("A human is born");
    }

    // a human should be able to perform some functions like eat ,walk , talk, sleep
    // e.t.c
    // let's define all this as methods:

    void eat() {
        System.out.println("eating");
    }

    void walk() {
        System.out.println("walking");

    }

    void talk() {
        System.out.println("hello!");

    }

    void sleep() {
        System.out.println("zzz");

    }

}

// a human could be either "male" or "female" biologically but both male and
// females are still humans
// a female human can concieve give birth
// a male human cannot give birth
// if we want to declare a female class we could write a new class for female
// and
// do the same for male but that would be repeatitive and inefficient so instead
// we make use of inheritance using the "extends" keyword

// defining a female class
class Female extends Human {
    // the female has it's own properties
    int wombSize;

    // defining a constructor for a female
    Female(String n, int a, int w) {
        super(n, a); // the super keyword is used to construct a new human from the superclass

        wombSize = w;
        System.out.println("it's a beautiful baby girl");
    }

    void concieve() {
        System.out.println("she is now pregnant");

    }

    void giveBirth() {
        System.out.println("she has delivered");

    }
}

// defining a male class
class Male extends Human {

    // defining a constructor for a male
    Male(String n, int a) {
        super(n, a); // the super keyword is used to construct a new human from the superclass
        System.out.println("it's a bouncing baby boy");

    }

    void cannotConcieve() {
        System.out.println("sorry i can't concieve i'm a male");
    }

    void cannotGiveBirth() {
        System.out.println("sorry i can't give birth i'm a male");

    }
}
