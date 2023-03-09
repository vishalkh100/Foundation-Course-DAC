import java.util.Scanner;

public class DigitOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter a digit to count");
        int digit = sc.nextInt();

        while(num>0) {
            int rem = num%10;
            if(rem==digit) {
                count++;
            }
            num = num/10;
        }

        System.out.printf("The number %d has occurred %d times.", digit, count);

    }
}
