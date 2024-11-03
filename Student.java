import java.util.Scanner;

public class Student {
    String name;
    int age;
    String course;

    public  Student (String name, int age, String course) {
    this.name = name;
    this.age = age;
    this.course = course;
}

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name:");
        String name = scan.nextLine();
        System.out.println("Please enter your age: ");
        int age = scan.nextLine();
        System.out.println("Please enter your course: ");
        String course = scan.nextLine();
        Student student1 = new Student(name, age, course);
        System.out.println("Student Details:");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Course: " + student1.course);
    }
    
}
