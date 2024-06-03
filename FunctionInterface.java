@FunctionalInterface
interface MyInterFace {
    void show();

}

public class FunctionInterface {
    public static void main(String[] args) {

        MyInterFace myfunc = () -> System.out.println("functional interface test");

        myfunc.show();
    }
}
