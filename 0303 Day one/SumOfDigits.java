import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits");

        System.out.println("Enter three digit number: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int a = number/100;
        number = number%100;

        int b = number/10;
        number = number%10;

        int c = number;

        int total = a+b+c;

        System.out.println("The total is: "+total);
        
    }
}
