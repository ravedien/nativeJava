package algo;

import java.time.Duration;
import java.time.Instant;

public class RecursiveFibonacci {

  // Method calling itself, where the solution depends to the smaller instances of the same problem

  public static int fibonacci(int n) {
    if (n < 2)
      return n;
    else
      return fibonacci(n - 2) + fibonacci(n - 1);
  }

  public static void main(String[] args) {
    Instant start = Instant.now();
    System.out.println(fibonacci(40));
    Instant end = Instant.now();
    long timeElapsed = Duration.between(start, end).toMillis();
    System.out.println("elapsed time in ms ::: " + timeElapsed);
  }
}
