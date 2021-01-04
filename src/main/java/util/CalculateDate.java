package util;

import static java.time.Instant.ofEpochMilli;
import static java.time.ZoneOffset.UTC;
import static java.time.ZonedDateTime.ofInstant;
import static java.time.ZonedDateTime.now;

import java.time.Duration;
import java.time.ZonedDateTime;

public class CalculateDate {
	

  /**
   * Calculate days between two given dates.
   *
   * @param oldDate    the oldest date.
   * @param recentDate the most recent date.
   * @return an integer value with the calculation.
   */
  private static boolean countDaysElapsed(ZonedDateTime oldDate, ZonedDateTime hoy) {
     
  int valor = (int) Duration
      .between(
          oldDate,
          hoy)
        .toDays();

  System.out.println(valor);
    
   return valor >= 1;

  }
	  
  /**
   * System date time in milliseconds.
   *
   * @return The number of milliseconds from the epoch of 1970-01-01T00:00:00Z.
   */
  public static long nowEpochMilli() {

    return
      ZonedDateTime
        .now(
          UTC)
        .toInstant()
        .toEpochMilli();

  }

}
