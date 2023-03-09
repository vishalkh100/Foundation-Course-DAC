import java.util.Scanner;

public class PatternNumber5 {
  public static void main(String[] args) {
    int rows = 5, k = 0, i, space;

    for (i = 1; i <= rows; ++i, k = 0) {
      for (space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}
