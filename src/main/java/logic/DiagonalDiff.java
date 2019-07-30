package logic;

public class DiagonalDiff {

  public static int diagonalDifference(int[][] arr) {
    int sum1 = 0;
    int sum2 = 0;
    for (int x = 0, y = arr.length - 1; x < arr.length; x++, y--) {
      sum1 += arr[x][x];
      sum2 += arr[x][y];
    }
    return Math.abs(sum1 - sum2);
  }

  public static void main(String[] args) {
    int[][] arr = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
    System.out.println(diagonalDifference(arr));
  }
}
