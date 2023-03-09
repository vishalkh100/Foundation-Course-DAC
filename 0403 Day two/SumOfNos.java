import java.util.Scanner;

public class SumOfNos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum  = 0;
        int num = 0;

        System.out.println("Enter 10 integers to find their sum");

        for(int i=1;i<=10;i++) {
            num = scanner.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum of the numbers is: " + sum);
    }
}