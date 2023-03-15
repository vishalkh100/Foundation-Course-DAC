import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Bubble sort------");

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" integers in the array:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println("The sorted array is as follows:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
