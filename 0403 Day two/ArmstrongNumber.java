import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int backup = 0;
        int rem = 0;
        int result = 0;
        int n = 0;

        

        for (backup = num; backup != 0; backup /= 10, ++n);

        backup = num;

        for (backup = num; backup != 0; backup /= 10)
        {
            rem = backup % 10;
            result += Math.pow(rem, n);
        }

        if(result == num)
            System.out.println("The number is an Armstrong number.");
        else
            System.out.println("The number is not an Armstrong number.");
        
    }
}
