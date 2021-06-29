package example;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OtherTest {

  @Test
  public void test() {
    String message = "Hello";
    System.out.println(message);
    assertTrue(message.length() == 5);
  }
}
