package algo;

import java.time.Duration;
import java.time.Instant;

public class DynamicRecursiveFibonacci {

  // Dynamic Programming - remember the past result and uses them to find new results
  // Uses tabulation such as arrays

  static int fibNumbers[];

  public static int fibonacci(int n) {
    if (n < 2)
      return n;
    else if (fibNumbers[n] != 0)
      return fibNumbers[n];
    else {
      int val = fibonacci(n - 2) + fibonacci(n - 1);
      fibNumbers[n] = val;
      return val;
    }

  }

  public static void main(String[] args) {
    int n = 40;
    fibNumbers = new int[n + 1];

    Instant start = Instant.now();
    System.out.println(fibonacci(n));
    Instant end = Instant.now();
    long timeElapsed = Duration.between(start, end).toMillis();
    System.out.println("elapsed time in ms ::: " + timeElapsed);
  }
}
