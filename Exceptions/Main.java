package Exceptions;

class Exc0 {
    public static void main(String[] args) {
        int d = 0;
        int a = 42 / d;
    }
}

class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
        System.out.println("This will not be printed.");
    }

    public static void main(String args[]) {
        try {
            Exc1.subroutine();
        } catch (ArithmeticException err) {
            System.out.println("Division by zero.");
        }

        System.out.println("After catch statement.");
    }
}