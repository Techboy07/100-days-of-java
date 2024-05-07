public class Main {

    public static void main(String[] args) {

        Box myBox = new Box();
        Box mybox2 = new Box();
        double vol;

        // for box 1
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // for box 2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // for box 1
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume is " + vol);

        // for box 2
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);

    }
}

class Box {
    double width;
    double height;
    double depth;
}