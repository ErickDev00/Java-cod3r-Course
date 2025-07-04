package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {



        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
            1. Numero para string binaria 6 => "110"
            2. Inverter a string "110" para => "011"
            3. Converter de volta para inteiro => "011" => 3
         */


        Function<Integer, String> binario = n -> Integer.toBinaryString(n);

        UnaryOperator<String> invertido = n -> new StringBuilder(n).reverse().toString();

        Function<String, Integer> voltou = v -> Integer.parseInt(v, 2);

        nums.stream().map(binario).map(invertido).map(voltou).forEach(System.out::print);



    }

}
