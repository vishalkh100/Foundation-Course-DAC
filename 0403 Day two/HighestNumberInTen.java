import java.util.Scanner;

public class HighestNumberInTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int highest = 0;

        for(int i=0; i<10; i++) {
            int num = sc.nextInt();
            if (num>highest) {
                highest = num;
            }
        }

        System.out.println("The highest number is: "+highest);

    }
}
