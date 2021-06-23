package com.example;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import org.junit.Test;

public class BasicTest {

  @Test
  public void test() throws ClassNotFoundException, NoSuchFieldException {
    int sum = 5 + 10;
    System.out.println("Ok, it works.");
    assertEquals(15, sum);

    // Try a reflection call to fail the test in native-image mode.
    Class<?> clazz = Class.forName("java.util.Scanner");

    String fieldName = "";
    if (System.currentTimeMillis() > 0) {
      fieldName = "position";
    }
    // This succeeds in normal mode, fails in native-image mode.
    Field field = clazz.getDeclaredField(fieldName);

    System.out.println("Class found: " + clazz);
    System.out.println("Field found: " + field);
  }
}
