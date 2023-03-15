import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        boolean flag = false;

        System.out.println("Enter 5 integers in the array:");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter an integer to search:");

        int check = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if(arr[i]==check) {
                flag = true;
            }
        }

        if(flag) {
            System.out.println("Element exists in the array");
        } else {
            System.out.println("Element does not exist in the array");
        }

    }
}