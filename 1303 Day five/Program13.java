public class Program13 {
    public static void main(String[] args) {

        int sum = 0;
        boolean flag = false;

        int[][] arr = new int[][] { {16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1} };
        // int[][] arr = new int[][] { {16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1} };
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < arr.length; i++) {
                if(i==j) {
                    sum = sum + arr[i][j];
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            int summation = 0;
            for (int j = 0; j < 4; j++) {
                summation = summation + arr[i][j];
            }
            if(sum!=summation) {
                flag = true;
                break;
            }
        }

        for (int i = 0; i < 4; i++) {
            int summation = 0;
            for (int j = 0; j < 4; j++) {
                summation = summation + arr[j][i];
            }
            if(sum!=summation) {
                flag = true;
                break;
            }
        }

        if(flag) {
            System.out.println("Not a magic square :(");
        } else {
            System.out.println("Magic square hai ! yay ! :)");
        }
    }
}
