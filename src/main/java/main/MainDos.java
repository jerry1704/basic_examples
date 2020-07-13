package main;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainDos {
  
  public static void main(String[] args) {
     

    
      System.out.println(generateRandomString(20));
}
  
  public static String generateRandomString(int length) {
    
    return new Random().ints(48, 57)
            .mapToObj(i -> (int) i)
            .limit(length)
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();
  }
}
