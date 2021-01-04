package util;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.time.LocalDateTime.parse;
import static java.time.ZoneOffset.UTC;
import static java.time.format.DateTimeFormatter.ofPattern;

public class CalculateDateH {
 
  public static void main(String []args) {
 
    final var formatter = ofPattern("dd/MM/yyyy HH:mm");
 
    asList(
        "CICIC8P1234,20/12/2020 00:00", 
        "CICIC9P1234,20/12/2020 00:00", 
        "CIC10P123412,20/12/2020 00:00",
        "CICIC11P1234,05/12/2020 00:00",
        "CICIC12P1233,05/12/2020 00:00",
        "CIC12P133333,05/12/2020 00:00",
        "CIC14P123412,06/10/2020 00:00",
        "CIC15P345634,06/09/2020 00:00",
        "CIC16P234565,07/08/2020 00:00",
        "CIC17P657345,08/07/2020 00:00",
        "CIC18P345645,09/05/2020 00:00",
        "CIC19P345654,09/04/2020 00:00",
        "CIC20P345634,10/03/2020 00:00",
        "CIC21P394596,09/02/2020 00:00" )
      .stream()
      .map(
        e -> e.split(","))
      .forEach(
        i -> System
              .out
              .println(
                format(
                  "put 'proveedores:accounts','%s','df:acd3',Bytes.toBytes(%s)",
                  i[0],
                  parse(
                      i[1],
                      formatter)
                    .atZone(
                      UTC)
                    .toInstant()
                    .toEpochMilli())));
 
  }
  
}
