public class testCasting{

    public static void main(String[] args){
        byte b = 127;
        System.out.println(b);
        System.out.println((short) b);
        System.out.println((int) b);
        System.out.println((long) b);

        int i = 1000000;
        System.out.println(i);
        System.out.println((short) i);

        System.out.println(Integer.toBinaryString(1000000));  
        System.out.println(Integer.toBinaryString(16960));
    }
}