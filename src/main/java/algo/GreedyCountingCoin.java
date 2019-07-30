package algo;

import java.util.ArrayList;
import java.util.List;

public class GreedyCountingCoin {

  // Greedy Algorithm - makes the optimal choice at each step as it attempts to find overall optimal
  // way to solve the entire problem.

  public static void main(String[] args) {
    System.out.println(countingCoin(31));
  }

  private static int[] denomination = {1, 5, 10, 20};

  public static List<Integer> countingCoin(int money) {
    List<Integer> coinBreakdown = new ArrayList<Integer>();

    for (int i = denomination.length - 1; i >= 0; i--) {
      int highestCoin = denomination[i];
      while (money >= highestCoin) {
        coinBreakdown.add(highestCoin);
        money -= highestCoin;
      }
    }



    return coinBreakdown;
  }
}
