import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int arr[] = new int[n];

        System.out.println("Enter 10 integers in the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the new element to add:");
        int num = sc.nextInt();

        System.out.println("Enter the index at which to enter the new number:");
        int index = sc.nextInt();

        arr[index] = num;

        System.out.println("New Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
