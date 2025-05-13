public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Celular";
        p1.preco = 3299.90;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "Tablet";
        p2.preco = 2990.90;
        p2.desconto = 0.35;

        System.out.println(p1.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.precoComDesconto();
        System.out.println(precoFinal1);




    }
}
