import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        System.out.println("Divisibilty");

        System.out.println("Enter the number: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%3==0) {
            System.out.print("three ");
        }
        if(number%7==0) {
            System.out.print("seven ");
        }

    }
}
