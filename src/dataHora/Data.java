package dataHora;

import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        //Formatar a Data
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
/// Instanciar uma data
        Date date = new Date();

        Instant instant = Instant.now();

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        // Instant d03 = new Instant.now();
        LocalDate d04 = LocalDate.parse("2023-04-05");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-05T01:30:26");

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);

        LocalDate d06 = LocalDate.parse("21/06/2004", fmt1);
        LocalDateTime d07 = LocalDateTime.parse("21/06/2004 01:30", fmt2);

        System.out.println(d06);
        System.out.println(d07);

        //Formatando a data acima
        System.out.println(d06.format(fmt1));
        System.out.println(d07.format(fmt2));
        LocalDate date1 = LocalDate.parse("23/10/2023", fmt3);
        System.out.println(date1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
