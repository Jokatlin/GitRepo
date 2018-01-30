package fi.academy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Java8Paivamaarat {
    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.of(2018,1,29);
        System.out.println(tanaan);

        LocalDate huhtikuu = LocalDate.of(2018,4,13);
        System.out.println(huhtikuu);

        LocalDate kahdenkuukaudenpaasta = LocalDate.now().plusMonths(2);
        System.out.println("Kahden kuukauden päästa on: " + kahdenkuukaudenpaasta + " Viikonpäivä: " + kahdenkuukaudenpaasta.getDayOfWeek());


        LocalDate uusiVuosi = LocalDate.of(2019,1,1);
        System.out.printf("first Friday of January 2019: %s%n",
                uusiVuosi.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY)));
    }
}
