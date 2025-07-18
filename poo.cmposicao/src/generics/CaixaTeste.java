package generics;

public class CaixaTeste {
    public static void main(String[] args) {

        //se não definir o tipo da caixa, ficara com Object
        Caixa<Double> caixaA = new Caixa<>();
        caixaA.guardar(2.4);

        Caixa<String> caixaB = new Caixa<>();
        caixaB.guardar("Teste");


        String coisaB = caixaB.abrir();
        System.out.println(coisaB);

    }
}
