public class PatternNumber8 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= 2*n-1; i++) {
            int spaces = (i<=n)?n - i: -(n-i);
            int buffer = n-i;
            int cols = (i<=n) ? 2*i-1: 2*n-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= cols; j++) {

                int element = (j<=i) ? j : i+i-j;

                System.out.print(element);
                
            }
            if(i==4) {
                System.out.print(1);
            }
            System.out.println();
        }
      
    }
}








// public class PatternNumber8 {
//     public static void main(String[] args) {
//         int n = 3;

//         for (int i = 1; i <= 2*n-1; i++) {
//             int spaces = (i<=n)?n - i: -(n-i);
//             int buffer1 = (n - i);
//             int cols = (i<=n) ? 2*i-1: 2*n-i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= cols; j++) {

//                 int element = (j<=i) ? j : i+i-j;

//                 System.out.print(element);
//             }
//             System.out.println();
//         }
      
//     }
// }

