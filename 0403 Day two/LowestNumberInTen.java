import java.util.Scanner;

public class LowestNumberInTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int lowest = 0;

        for(int i=0; i<10; i++) {
            int num = sc.nextInt();
            if(i==0) {
                lowest = num;
            } else  {
                if (num<lowest) {
                    lowest = num;
                }
            }
        }

        System.out.println("The lowest number is: " + lowest);

    }
}
