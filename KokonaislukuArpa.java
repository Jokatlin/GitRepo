package fi.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KokonaislukuArpa {
    public static void main(String[] args) {
        final Random rnd = new Random();
        List<Integer> numerot = IntStream
                .generate(()->100 + rnd.nextInt(1000))
                .limit(5)
                .mapToObj(Integer::valueOf)   // Muutetaan integer tyyppiseksi, sama kun .boxed()
                .collect(Collectors.toList());
        System.out.println(numerot);
        List<Integer> numeroLista = new ArrayList<Integer>();
        int sum = 0;
        for (int i:numerot) {
            numeroLista.add(i);
            sum += i;

        }
        System.out.println("Numerolista: " + numeroLista + " Summa: " + sum);

    }
}
