package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"};
        Person p1 = new Person(name, "moogah");
        System.out.println(p1);
        Student s1 = new Student(name, "frooble", "1234567890");
        System.out.println(s1);

        Person[] people = {p1, s1};
        for (Person p : people) {
            System.out.println(p); // What should this print?
        }

        s1.changeLastName("NewLast");
        System.out.println(p1);
        System.out.println(s1);
     }

}
