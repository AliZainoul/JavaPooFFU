public class main_ {

    public static void printLine() {
        System.out.println("--------------------------------");
    }

    public static void main (String[] args) {
        Person p = new Person("John", 25, 123456);
        printLine();
        p.printInfos();
        printLine();
        final String[] courses = {"Maths", "C++", "Java"};
        Student s = new Student("Ali", 29, 132172, courses);
        printLine();
        s.printInfosStudent();
        printLine();
    }
}