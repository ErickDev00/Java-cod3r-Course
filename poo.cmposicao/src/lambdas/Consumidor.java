package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args){

        //Consumer<String> imprimir = valor -> System.out.println(valor);
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimir.accept(p1);

        //exemplo com list
        Produto p2 = new Produto("Tenis", 3.34, 0.09);
        Produto p3 = new Produto("Lapis", 2.34, 0.09);
        Produto p4 = new Produto("Borracha", 1.34, 0.09);
        Produto p5 = new Produto("Corretivo", 5.34, 0.09);
        Produto p6 = new Produto("Estojo", 20.34, 0.09);


        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);

        produtos.forEach(imprimir);







    }




}
