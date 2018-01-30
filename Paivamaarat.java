package fi.academy;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Paivamaarat {
    public static void main(String[] args) {
       Calendar tanaan = new GregorianCalendar(2018,0,29,15,33);

        System.out.println("Tänään on: " + tanaan.getTime() );

        Calendar huhtikuu = new GregorianCalendar(2018, 3,13);

        System.out.println("Huhtikuussa: " + huhtikuu.getTime());



     /*   String viikonpaiva = huhtikuu.getDisplayName(huhtikuu.DAY_OF_WEEK, huhtikuu.LONG, new Locale("fi"));
        System.out.println(huhtikuu.get(Integer.parseInt(viikonpaiva)));*/

        tanaan.roll(Calendar.DAY_OF_MONTH,3);
        System.out.println(tanaan.getTime());

        tanaan.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(tanaan.getTime());

        Calendar karkausvuosi = new GregorianCalendar(2018, 1,29);

        System.out.println("Karkausvuosi: " + karkausvuosi.getTime());

        Calendar tanaan1 = Calendar.getInstance();
        tanaan1.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(tanaan1.getTime());
        tanaan = Calendar.getInstance();
        tanaan1.roll(Calendar.DAY_OF_MONTH, 3);
        System.out.println(tanaan1.getTime());

       /* Date d = new Date();
        d = new Date(118,3,13);
        System.out.println(d);*/

//       c.setLenient(false);   // kalenteri ei enää joustava
    }
}
