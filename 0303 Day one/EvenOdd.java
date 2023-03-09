import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Even Odd");

        System.out.println("Enter the number: ");

        Scanner sc = new Scanner(System.in);
        Integer no = sc.nextInt();
        
        if(no==0) {
            System.out.println("Number 0 is neither even nor odd");
        } else {
            if(no%2==0) {
                System.out.println("the number "+no+" is even");
            } else {
                System.out.println("the number "+no+" is odd");
            }
        }
    }
}
