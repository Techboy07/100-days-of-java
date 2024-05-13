package importing;

public class Main {
    public static void main(String[] args) {
        MyDate newDate = new MyDate();
    }
}

class MyDate extends java.util.Date {
    MyDate() {
        System.out.println(this);
    }
}