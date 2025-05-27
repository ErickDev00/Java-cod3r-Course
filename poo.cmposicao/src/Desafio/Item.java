package Desafio;
public class Item {
    int quantidade;


    Produto produto; //1 item aponta para apenas um produto.

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
