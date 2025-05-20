import java.util.Scanner;

public class DesafioFor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas serão informadas?");
        int qtdNotas = entrada.nextInt();

        //criando o array;
        double[] notas = new double[qtdNotas];
        int contagemInicial = 0;


        for (int i=0; i < notas.length; i++){
            contagemInicial++;

            System.out.println("Digite a nota " + contagemInicial);
            notas[i] = entrada.nextDouble();
        }

        double total = 0;

        for (double nota: notas){
            total += nota;
        }
        double media = total/notas.length;
        System.out.println("O valor da média das notas é " + media);

        entrada.close();

    }
}
