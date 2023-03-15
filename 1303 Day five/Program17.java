import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.printf("Enter %d integers in the array:\n", n);
        int[] arr = new int[n];
        int b = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array is:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]) {
                    count1++;
            } else {
                    count2++;
            }
        }

        if(count1>0 || count2>0) {
            if(count1==n-1) {
                System.out.println("Ascending order");
            } else if(count2==n-1) {
                System.out.println("Descending order");
            } else {
                System.out.println("Unordered entries");
            }
        }

    }
}
