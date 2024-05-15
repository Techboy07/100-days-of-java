package ThrowD;

class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("inside throw one");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (Exception e) {

            System.out.println("caught " + e);
        }
    }
}
