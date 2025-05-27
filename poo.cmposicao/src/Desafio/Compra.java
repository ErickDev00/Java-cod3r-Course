package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    Cliente cliente; //Uma compra aponta para apenas um cliente.

    final List<Item> itens = new ArrayList<>(); //compra é composta por uma lista de itens.

    //adiciona os itens na lista.
    void adicionarItens(Item item){
        if (item != null) {
            itens.add(item);
        }
    }
    /*
        void adicionarItens(Produto p, int qtde){
            this.itens.add(new Item(p, qtde)); criou item passando para a lista.
        }
     */

    public List<Item> getItens() {
        return itens;
    }






}
