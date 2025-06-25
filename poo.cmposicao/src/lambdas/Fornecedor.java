package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        //interface funcional que não recebe nenhum parâmetro
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Teste");

        System.out.println(umaLista.get());









    }

}
