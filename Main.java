public class Main {

    public static void main(String[] args) {

        Box myBox = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        // for box 1
        vol = myBox.volume();
        System.out.println("Volume is " + vol);

        // for box 2
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);

    }
}

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    protected void finalize() {

    }
}