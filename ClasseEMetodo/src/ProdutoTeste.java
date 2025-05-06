public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Celular";
        p1.preco = 3299.90;
        p1.desconto = 0.25;

        System.out.println(p1.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        System.out.println(precoFinal1);




    }
}
