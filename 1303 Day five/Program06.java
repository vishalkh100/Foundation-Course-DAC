import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        boolean flag = false;

        System.out.println("Enter 5 integers in the array:");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        sortArray(arr);

        System.out.println("Enter an integer to search:");

        int check = sc.nextInt();

        binarySearch(arr, check);

    }

    public static int[] sortArray(int[] arr) {

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < (5 - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;

    }

    public static void binarySearch(int arr[], int key) {
        int first = 0;
        int last = arr.length-1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

}
