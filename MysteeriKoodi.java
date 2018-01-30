package fi.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MysteeriKoodi {
    public static void main(String[] args) throws IOException {
        Path main = Paths.get("./src/fi/academy/").resolve("Caesar.java");
        Map<String, Long> kaikki = Files.lines(main)
                .map(rivi -> rivi.split("[\\s\\p{Punct}]+")) // Stream<String[]>  , splittaa jokaisen rivin
                .flatMap(Arrays::stream) // Stream<String>  , yksittäiosiä sanoja peräkkäin yhdessä putkessa
                .filter(s -> !s.isEmpty()) // tyhjät rivit pois
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  // Gourping by palauttaa mapin
        kaikki.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())  // mappi järjestykseen arvon perusteella
                .forEachOrdered(e -> System.out.println(String.format("%2$4d: %1$s",  // kaikki järjestyksessä
                        e.getKey(), e.getValue())));  // Mikä arvo tulee
    }
}
