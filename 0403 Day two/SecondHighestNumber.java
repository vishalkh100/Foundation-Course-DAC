import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int highest = 0;
        int secondHighest = 0;

        for(int i=0; i<10; i++) {
            int num = sc.nextInt();
            if (num>highest) {
                secondHighest = highest;
                highest = num;
            }
        }

        System.out.println("The second highest number is: "+secondHighest);

    }
}
