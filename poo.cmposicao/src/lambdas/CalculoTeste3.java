package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        //int (primitivo) -> Double (classe) = conversão NÃO permitida.
        //double (primitivo) -> Double (classe)

        BinaryOperator<Double> calc = (x, y) -> {return x+ y; };
        System.out.println(calc.apply(2.0,3.0));


        calc = (x, y) -> x* y;
        System.out.println(calc.apply(5.0, 7.9));




    }

}
