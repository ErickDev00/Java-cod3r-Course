package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1, 3, 4, 6, 8, 54, 32);

        BinaryOperator<Integer> soma = (ac, n) -> ac +n;
        int total = nums.stream().reduce(soma).get();
        System.out.println(total);

        //Resultado foi um Opcional<Integer>
        nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);




    }

}
