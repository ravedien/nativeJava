package algo;

import java.time.Duration;
import java.time.Instant;

public class DynamicFibonacci {

  // Dynamic Programming - remember the past result and uses them to find new results
  // Uses tabulation such as arrays

  public static int fibonacci(int n) {
    int fibNumbers[] = new int[n + 2];
    fibNumbers[0] = 0;
    fibNumbers[1] = 1;
    for (int i = 2; i <= n; i++) {
      fibNumbers[i] = fibNumbers[i - 2] + fibNumbers[i - 1];
    }
    return fibNumbers[n];
  }

  public static void main(String[] args) {
    Instant start = Instant.now();
    System.out.println(fibonacci(40));
    Instant end = Instant.now();
    long timeElapsed = Duration.between(start, end).toMillis();
    System.out.println("elapsed time in ms ::: " + timeElapsed);
  }
}
