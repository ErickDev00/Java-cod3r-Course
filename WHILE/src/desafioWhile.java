import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String texto = "";

        int quantidadeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1){
            System.out.print("Informe a nota de 0 a 10: (ou -1 para sair e calcular a media)");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){
                total += nota;
                quantidadeNotas++;
            } else if(nota != -1){
                System.out.println("nota inválida.");
            }

        }

        //calculando a media
        double media = total / quantidadeNotas;
        System.out.println("Média = " + media);

        entrada.close();

    }
}
