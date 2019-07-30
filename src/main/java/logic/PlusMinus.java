package logic;

public class PlusMinus {

  static void plusMinus(int[] arr) {
    double positive = 0;
    double zero = 0;
    double negative = 0;
    int arrLength = arr.length;

    for (int val : arr) {
      if (val > 0)
        positive++;
      else if (val < 0)
        negative++;
      else
        zero++;
    }
    System.out.printf("\n%1$.6f", positive/arrLength);
    System.out.printf("\n%1$.6f", negative/arrLength);
    System.out.printf("\n%1$.6f", zero/arrLength);
    
  }

  public static void main(String[] args) {
    plusMinus(new int[] {-4, 3, -9, 0, 4, 1});
  }

}
