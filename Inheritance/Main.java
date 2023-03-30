public class Main
{
  public static void main(String[] args)
  {
    ClassA ca = new ClassA(1, 2, 3, 4);
    //System.out.println("----------------------------");
    //System.out.println("Call to my privated Method:");
    //ca.privateMethod();
    System.out.println("-------------TEST CLASS A---------------");

    System.out.println("----------------------------");
    System.out.println("Call to my protected Method:");
    ca.protectedMethod();

    System.out.println("----------------------------");
    System.out.println("Call to my public Method:");
    ca.publicMethod();

    System.out.println("----------------------------");
    System.out.println("Call to my default Method:");
    ca.defaultMethod();

    /*
    //System.out.println("----------------------------");
    //System.out.println("Call to my privated Method:");
    //ca.privateMethod();
    System.out.println("-------------TEST CLASS A après DOWNCASTING---------------");

    System.out.println("----------------------------");
    System.out.println("Call to my protected Method:");
    ((ClassB) ca).protectedMethod();

    System.out.println("----------------------------");
    System.out.println("Call to my public Method:");
    ((ClassB) ca).publicMethod();

    System.out.println("----------------------------");
    System.out.println("Call to my default Method:");
    ((ClassB) ca).defaultMethod();
    */




    ClassB cb = new ClassB(1,2,3,4,5,6,7,8);
    System.out.println("-------------TEST CLASS B---------------");
    System.out.println("----------------------------");
    System.out.println("Call to my protected Method:");
    cb.protectedMethod();

    System.out.println("----------------------------");
    System.out.println("Call to my public Method:");
    cb.publicMethod();

    System.out.println("----------------------------");
    System.out.println("Call to my default Method:");
    cb.defaultMethod();


    System.out.println("-------------TEST CLASS B après UPCASTING---------------");
    System.out.println("----------------------------");
    System.out.println("Call to my protected Method:");
    ((ClassA) cb).protectedMethod();

    System.out.println("----------------------------");
    System.out.println("Call to my public Method:");
    ((ClassA) cb).publicMethod();

    System.out.println("----------------------------");
    System.out.println("Call to my default Method:");
    ((ClassA) cb).defaultMethod();

  }
}
