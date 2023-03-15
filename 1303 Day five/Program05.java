import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements in array 1:");
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 elements in array 2:");
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        sortArray(arr1);
        System.out.println("Sorted array 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        sortArray(arr2);
        System.out.println("Sorted array 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("After combining sorted arrays - arr1 and arr2, new formed array is:");

        int[] arrayNew = new int[10];

        for (int i = 0; i < arrayNew.length; i++) {
            if(i<5) {
                arrayNew[i] = arr1[i];
            } else {
                arrayNew[i] = arr2[i-5];
            }
        }



        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i]+" ");
        }

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
}
