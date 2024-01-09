package dataHora.testeObjetoComDataHora;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConversaoDataHoraGlobalParaLocal {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-08-24T01:30:26");
        Instant instant = Instant.parse("2023-08-20T01:30:26Z");
        LocalDate pastWeek = d04.minusDays(7);

        LocalDate r1 = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(instant, ZoneId.of("Portugal"));
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(pastWeek.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        Duration duration = Duration.between(pastWeek,d04);

        System.out.println(duration.toDays());


    }
}
