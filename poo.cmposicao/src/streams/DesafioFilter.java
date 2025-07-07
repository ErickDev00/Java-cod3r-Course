package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("Lapis", 3.00, 0.08, 2.00);
        Produto p2 = new Produto("Borracha", 2.00, 0.08, 2.00);
        Produto p3 = new Produto("Caneta", 15.00, 0.4, 2.00);
        Produto p4 = new Produto("Caderno", 23.00, 0.08, 2.00);
        Produto p5 = new Produto("Livro", 10.00, 0.08, 2.00);
        Produto p6 = new Produto("Agenda", 21.00, 0.4, 2.00);
        Produto p7 = new Produto("Folha", 22.00, 0.4, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
        Predicate<Produto> freteGratis = p -> p.valorFrete ==0;

        Function<Produto, String> chamada = p -> "Aproveite " + p.nome + " por " + p.preco;


        produtos.stream().filter(superPromocao).filter(freteGratis).map(chamada).forEach(System.out::println);

    }


}
