package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {


        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        //forma tradicional forEach
        for (String nome: aprovados){
            System.out.println(nome);
        }


        //formato lambda (mais fácil)
        aprovados.forEach(nome ->
            System.out.println(nome + "!!!")
        );


        //Method Reference
        aprovados.forEach(System.out::println);


    }

}
