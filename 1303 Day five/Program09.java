import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,0};
        int index = -1;
        int length = arr.length;

        System.out.println("Entered array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter a number to delete from the array:");
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key) {
                index = i;
                for (int j = index; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                length--;
                break;
            }
        }

        if(index>=0) {
            System.out.println("New array is:");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i]+" ");
            }
        } else {
            System.out.println("Entered number not found!");
        }

    }
}
