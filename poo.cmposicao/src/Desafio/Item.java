package Desafio;
public class Item {
    int quantidade;
    Produto produto; //Cada produto pertence a um único Item.

    //recebe o objeto como parâmetro.
    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    //
    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }



}
