class Box {
    double width;
    double height;
    double depth;

    // construct clone of an object
    Box(Box ob) {
        // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

// Here, Box is extended to include weight.
class BoxWeight extends Box {
    double weight;

    // constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

// class DemoBoxWeight {
// public static void main(String[] args) {
// BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
// BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
// double vol;

// vol = mybox1.volume();
// System.out.println("Volume of mybox1 is " + vol);
// System.out.println("Weight of mybox1 is " + mybox1.weight);
// System.out.println();

// vol = mybox2.volume();
// System.out.println("Volume of mybox2 is " + vol);
// System.out.println("Weight of mybox2 is " + mybox2.weight);
// }
// }

class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();

        // assign BoxWeight reference to Box reference
        plainbox = weightbox;

        vol = plainbox.volume(); // OK, volume() defined in Box
        System.out.println("Volume of plainbox is " + vol);
        /*
         * The following statement is invalid because plainbox
         * does not define a weight member.
         */
        // System.out.println("Weight of plainbox is " + plainbox.weight);
    }
}