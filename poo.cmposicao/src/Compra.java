import java.util.ArrayList;
public class Compra {
    //classe que representa uma compra feita pelo cliente.
    String cliente; //aqui seria outro objeto para o cliente.

    //construtores
    Compra(String cliente){
        this.cliente = cliente;
    }

    //adicionando vários objetos do tipo Item dentro da Compra:
    ArrayList<Item> itens = new ArrayList<>();

    //métodos
    void adicionarItem(String nome, int quantidade, double preco){ //para não criar o item manualmente.
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    //recebe o objeto já criado como parâmetro.
    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this; //faz o item saber a qual compra pertence.
    }

    //overloading: dois métodos com assinaturas diferentes e mesmo nome.


    double obterValorTotal(){
        double total = 0;
        for (Item item: itens){
            total += item.quantidade * item.preco;
        }
        return  total;
    }










}
