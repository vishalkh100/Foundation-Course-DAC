import java.util.Scanner;

public class NextFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        for(int i=1; i<=5; i++) {
            System.out.print(num+i + " ");
        }
    }
}