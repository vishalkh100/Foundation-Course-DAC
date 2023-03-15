import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unique Array");
        int n = 15;
        System.out.printf("Enter %d integers in the array:\n", n);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        
        int length = arr.length;

        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if(arr[i]==arr[j]) {
                    for (int k = j; k < length-1; k++) {
                        arr[k]=arr[k+1];
                    }
                    length--;
                    j--;
                }
            }
        }

        System.out.println("Final Array:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
