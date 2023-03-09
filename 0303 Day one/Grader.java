import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        System.out.println("Grade Checker");

        System.out.println("Enter the marks: ");

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks>100 || marks<0) {
            System.out.println("Wrong marks entered!");
        } else if(marks <= 100 && marks >= 75) {
            System.out.println("Grade A");
        } else if(marks <= 75 && marks > 55) {
            System.out.println("Grade B");
        } else if(marks <=55 && marks >= 35) {
            System.out.println("Grade C");
        } else {
            System.out.println("Failed");
        }

    }
}
