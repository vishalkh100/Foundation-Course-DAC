import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Selection sort------");

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" integers in the array:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < n; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        } 

        System.out.println("The sorted array is as follows:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
