import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.printf("the LCM of %d and %d is: ", num, num2);

        for (int i = 2; i < num/2; i++)// loop starts from 2 because 0 and 1 are already printed
        {
            if(num%i==0 && num2%i==0) {
                System.out.println(i);
            } else {
                System.out.println("No LCM other than 1");
            }
        }

    }
}
