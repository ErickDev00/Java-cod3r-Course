public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Celular", 3299.90);
        //p1.nome = "Celular";
        //p1.preco = 3299.90;
        //p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "Tablet";
        p2.preco = 2990.90;

        Produto.desconto = 0.29;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();

        System.out.println(p1.nome + "" + precoFinal1);
        System.out.println(p2.nome + "" + precoFinal2);







    }
}
