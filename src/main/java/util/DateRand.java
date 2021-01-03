package util;

import java.util.Random;

public class DateRand {
  
  public static String generateRandomString(int length) {
    
    return new Random().ints(48, 57)
            .mapToObj(i -> (int) i)
            .limit(length)
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();
  }
}
