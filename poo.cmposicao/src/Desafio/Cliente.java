package Desafio;
import java.util.ArrayList;
import java.util.List;

public class Cliente {


    final String nome;
    final List<Compra> compras = new ArrayList<>(); //relação de cliente com compra.

    //construtor de cliente
    Cliente(String nome){
        this.nome = nome;
    }

    double valorTotalCompra(){
        double valorFinal = 0.0;
        for (Compra compra : this.compras){
             for (Item item : compra.getItens()){
                 valorFinal += item.getSubtotal();
             }
        }
        return valorFinal;
    }



}
