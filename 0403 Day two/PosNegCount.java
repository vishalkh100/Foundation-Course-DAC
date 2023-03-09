import java.util.Scanner;

public class PosNegCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pos  = 0;
        int neg = 0;
        int num = 0;

        System.out.println("Enter 10 integers: ");

        for(int i=1;i<=10;i++) {
            num = scanner.nextInt();
            if(num<0) {
                neg++;
            } else if(num>0) {
                pos++;
            }
        }

        System.out.printf("Count of the positive numbers is %d and negative numbers is %d", pos, neg);
    }
}
