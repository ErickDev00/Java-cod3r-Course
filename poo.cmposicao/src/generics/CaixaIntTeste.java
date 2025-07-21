package generics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA = new CaixaInt<>();
        caixaA.guardar("Teste");

        String coisaA = caixaA.abrir();






    }

}
