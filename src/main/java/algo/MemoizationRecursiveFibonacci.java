package algo;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class MemoizationRecursiveFibonacci {

  // Memoization - remember the past result and uses them to find new results
  // Uses Maps

  private static Map<Integer, Integer> memoizationMap = new HashMap<Integer, Integer>();

  public static int fibonacci(int n) {
    if (n < 2)
      return n;
    else if (memoizationMap.containsKey(n))
      return memoizationMap.get(n);
    else {
      int val = fibonacci(n - 2) + fibonacci(n - 1);
      memoizationMap.put(n, val);
      return val;
    }
  }

  public static void main(String[] args) {
    Instant start = Instant.now();
    System.out.println(fibonacci(40));
    Instant end = Instant.now();
    long timeElapsed = Duration.between(start, end).toMillis();
    System.out.println("elapsed time in ms ::: " + timeElapsed);
  }

}
