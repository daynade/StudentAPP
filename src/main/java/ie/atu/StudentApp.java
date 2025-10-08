package ie.atu;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your student email");
        String email = sc.nextLine();
        System.out.println("Enter your student password");
        String password = sc.nextLine();
    }
}
