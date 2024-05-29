
class EnumDemo {
    public static void main(String[] args) {
        Apple ap = Apple.RedDel;
        if (ap == Apple.RedDel) {
            System.out.println("ap contains GoldenDel.\n");
        } else {
            System.out.println("ap does not contains GoldenDel.\n");
        }

        for (Apple app : Apple.values()) {
            System.out.println(app + " costs " + app.getPrice() + " cents and compares to " + app.compareTo(ap));
            System.out.println();
        }
    }

    int getStuff() {
        Integer a = 2;
        var b = a.intValue();
        return b;
    }
}

enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // price of each apple
    // Constructor

    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }

}
