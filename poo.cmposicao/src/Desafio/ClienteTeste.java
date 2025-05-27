package Desafio;

public class ClienteTeste {
    public static void main(String[] args) {

    Cliente c1 = new Cliente("Erick");

    Produto p1 = new Produto("Caneta Azul", 2.00);
    Item i1 = new Item(p1, 4);

    Produto p2 = new Produto("Caderno", 10.00);
    Item i2 = new Item(p2, 3);

    //depois criar construtor para facilitar.
    Compra compra = new Compra();
    compra.cliente = c1;
    compra.adicionarItens(i1);
    compra.adicionarItens(i2);


    c1.compras.add(compra);

    System.out.println("Total gasto por " + c1.nome + ": R$" + c1.valorTotalCompra());


    }
}
