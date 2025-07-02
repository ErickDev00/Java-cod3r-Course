package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        //exemplos de criação.
        Consumer<String>print = System.out::print;

        Stream<String> langs = Stream.of("Java", "Go");
        langs.forEach(print);

        //criar stream a partir de um array:
        String[] maisLangs = {"Js", "Ruby"};
        Stream.of(maisLangs).forEach(print);

        //passando com o array inteiro:
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);

        //dizer qual você quer (não inclui o 2):
        Arrays.stream(maisLangs, 0, 2).forEach(print);

        List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin");
        outrasLangs.stream().forEach(print);

        //paralelo sem ordem:
        outrasLangs.parallelStream().forEach(print);

        //gerando com generate:
        //Stream.generate(() -> "a").forEach(print);






    }
}
