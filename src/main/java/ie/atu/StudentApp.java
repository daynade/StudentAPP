package ie.atu;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("How many students do you want to add?");
        int totalStudents = sc.nextInt(); //storing student amount
        ArrayList<Student> students = new ArrayList<>(); //declared arraylist

        while (i < totalStudents) {
            sc.nextLine(); //Fix for empty name scan
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter your student email");
            String email = sc.nextLine();
            System.out.println("Enter your student password");
            String password = sc.nextLine();
            Student student1 = new Student(); //created student object
            students.add(student1); //adding new student to arraylist
            i++;
        }
    }
}
