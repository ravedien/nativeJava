package com.example.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionalTest {

  @Test
  public void whenCreatesEmptyOptional_thenCorrect() {
    Optional<String> empty = Optional.empty();
    assertFalse(empty.isPresent());
  }

  @Test
  public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
    String name = "Doe";
    Optional<String> optName = Optional.of(name);
    assertTrue(optName.isPresent());
  }

  @Test(expected = NullPointerException.class)
  public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
    String name = null;
    Optional.of(name);
  }

}
