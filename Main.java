class Factorial {
    static int fact(int n) {
        int result;

        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        System.out.println("Factorial of 3 is " + Factorial.fact(3));
        System.out.println("Factorial of 4 is " + Factorial.fact(4));
        System.out.println("Factorial of 5 is " + Factorial.fact(5));
    }
}