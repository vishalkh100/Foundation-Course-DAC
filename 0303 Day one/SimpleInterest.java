import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Simple Interest");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter prinipal amount");
        int p = sc.nextInt();

        System.out.println("Enter rate of iterest/annum");
        double i = sc.nextDouble();
        double interest = i / 100;

        System.out.println("Enter number of years");
        double n = sc.nextDouble();

        double si = p * interest * n;

        System.out.println("Th simple interest is: "+ si);

    }
}
