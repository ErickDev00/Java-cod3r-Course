package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int res1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(res1);


        //compose faz ao contrário do andThen

    }
}
