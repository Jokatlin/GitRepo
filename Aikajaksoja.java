package fi.academy;

import java.time.LocalDate;
import java.time.Period;

public class Aikajaksoja {
    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.of(2018,1,29);
        LocalDate johanna = LocalDate.of(1994,9,12);
        LocalDate valmistuminen = LocalDate.of(2018,4,13);

        Period johannanIka = Period.between(tanaan, johanna);
        System.out.println("Olen " + johannanIka + " vanha.");

        Period aikaaValmistumiseen = Period.between(tanaan,valmistuminen);
        System.out.println("Aikaa valmistumiseen: " + aikaaValmistumiseen);

        System.out.println("Olen syntynyt: " + johanna.getDayOfWeek());
    }
}
