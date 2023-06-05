package ccc;

public class TestTI {
    public static void main(String[] args) {
//        TestInterface a = new TestInterfaceimpl();
//
//        TestInterface b = new TIImpl1();
        try {
            System.out.println(2 / 0);
            System.out.println(2 / 1);
            System.out.println(2 / 2);
            System.out.println(2 / 3);
            System.out.println(2 / 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
