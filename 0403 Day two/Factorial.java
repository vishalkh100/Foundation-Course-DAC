import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fact = 0;

        System.out.println("Enter a number to find its factorial: ");

        int num = scanner.nextInt();
        fact = num;
        if(num==0) {
            fact = 1;
        } else {
            for(int i = num; i>1; i--) {
                fact = fact * (i-1);
            }
        }

        System.out.println("Factorial of the number is: " + fact);
    }
}
