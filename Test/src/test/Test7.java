package test;

public class Test7 {

    private String testName = "testName";

    public Test7() {
        cellName();
    }
    public void cellName() {

        System.out.println(testName);
    }

    static class A extends Test7 {

        private String testName = "aName";

        public void cellName() {
            System.out.println(testName);
        }
        
        public static void main(String[] args) {
            Test7 t = new A();
        }

    }

}
