package fi.academy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ViikonpaivaStream {
    public static void main(String[] args) {
        String [] viikko = {"maanantai", "tiistai", "keskiviikko", "torstai",
                "perjantai", "lauantai", "sunnuntai"};

        List<String> lista = Arrays.asList(viikko);

        List <String> isotKirjaimet = lista.stream()
                                           .map(String::toUpperCase)
                                           .sorted((s1, s2) -> s1.length() -s2.length())  // sortaa sanan pituuden mukaan
                                           .collect(Collectors.toList());


        System.out.println(isotKirjaimet);
    }


}
