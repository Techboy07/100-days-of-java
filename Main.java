class Main {

    public static void main(String[] args) {

        Calculator myCalc = new Calculator();
        int result = myCalc.add(a:31,b:3);
        System.out.println(result);

    }
}

class Calculator {
    int a;
    int b;

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public double add(double a, int b) {
        double sum = a + b;
        return sum;
    }

    public int binary_search(
            int[] arr, int item) {
        return 0;
    }

}