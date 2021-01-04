package main;

import static java.time.Instant.ofEpochMilli;
import static java.time.ZoneOffset.UTC;
import static java.time.ZonedDateTime.now;
import static util.CalculateDate.nowEpochMilli;
import static util.CalculateDate.countDaysElapsed;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.var;

public class Main {

  public static void main(String[] args) {
    
    
    ZonedDateTime statusDate = now()
                                 .minusDays(330);
        
    ZonedDateTime  vieja = ZonedDateTime
                             .ofInstant(
                               Instant
                                 .ofEpochMilli(
                                   1606243454000L), 
                                   ZoneId
                                     .systemDefault());
    
    ZonedDateTime  hoy = ZonedDateTime
                           .ofInstant(
                             ofEpochMilli(
                               nowEpochMilli()),
                             UTC);
    
    System.out.println("Fecha antigua   " + statusDate);
    
    System.out.println("\nfecha de hoy  " + hoy);
      
    countDaysElapsed(statusDate , hoy);   

  }
    
}
