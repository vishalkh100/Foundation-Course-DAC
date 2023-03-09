import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int num2 = num;
        int sum = 0;

        while(num2>0) {
            int rem = num2%10;
            sum = sum + fact(rem);
            num2 = num2/10;
        }

        if(sum == num) {
            System.out.println("The number is special");
        } else {
            System.out.println("The number is ordinary");
        }

    }

    private static int fact(int n) {
        int result = 0;

        result = n;
        if(n==0) {
            result = 1;
        } else {
            for(int i = n; i>1; i--) {
                result = result * (i-1);
            }
        }

        return result;
    }
}
