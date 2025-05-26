public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra("Erick");
        c1.adicionarItem("Corsa", 1, 10000.00); //dessa maneira adiciona a compra dentro do item. Bidirecional.
        c1.adicionarItem("Borracha", 10, 2.00);

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());

        //demonstrando relação bidirecional!!!
        double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println(total);

    }
}
