package example;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OtherTest {

  @Test
  public void test() {
    String message = "Hello";
    System.out.println(message);
    assertTrue(message.length() == 5);
  }
}
