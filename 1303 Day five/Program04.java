import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Insertion sort------");

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" integers in the array:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            for (int j = i-1; j > 0; j--) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        System.out.println("The sorted array is as follows:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
