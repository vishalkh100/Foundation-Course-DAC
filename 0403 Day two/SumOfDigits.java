import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number");
        int num = sc.nextInt();

        while(num>0) {
            
            int rem = num%10;
            num = num/10;
            sum = sum + rem;
        }

        System.out.println("Sum is: "+sum);

    }
}
