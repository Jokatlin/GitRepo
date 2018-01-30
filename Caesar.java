package fi.academy;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Caesar {
    public static void main(String[] args) {
        String aakkoset = "abcdefghijklmnopqrstuvwxyz";
        IntStream virta = aakkoset.chars();

        String tulos = virta.map(i-> i+2)  // Tämän voi tehdä seuraavalla rivillä!
                .mapToObj(i-> ""+ (char)(i+0))   // tyyppimuunnos, kerto- jakolaskut ennen yhteen- ja vähennyslaskuja
                .collect(Collectors.joining(" "));

        System.out.println(tulos);


/*
    } private static String salaa(String sana) {
        char [] sana_arr = sana.toCharArray();
        for (int i = 0; i < sana_arr.length; i++) {
            sana_arr[i] += 3;
        }

        return new String (sana_arr);
    }

    private static void yksiMerkkijono(){
        String mjono = "merkkijono";
        System.out.println(salaa(mjono));
*/

    }
}
