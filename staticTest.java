public class staticTest {

    public static int counter;
    staticTest() {counter++;}

    public static void printLine(){
        System.out.println("----------------------");
    }
    
    public static void main(String[] args) {
        printLine();
        staticTest t1 = new staticTest();
        staticTest t2 = new staticTest();
        staticTest t3 = new staticTest();
        staticTest t4 = new staticTest();
        staticTest t5 = new staticTest();
        staticTest t6 = new staticTest();
        staticTest t7 = new staticTest();
        staticTest t8 = new staticTest();
        staticTest t9 = new staticTest();
        staticTest t10 = new staticTest();

        printLine();
        System.out.println("Number of objects created: " + counter);
        printLine();
    }
}