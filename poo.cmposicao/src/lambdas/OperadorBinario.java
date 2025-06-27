package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.3,9.6));

        BiFunction<Double, Double, String> res = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(res.apply(7.4,7.9));










    }
}
