import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0){
            System.out.println("Nota inválida!");
        } else if (nota >= 8.1){
            System.out.println("Conceito 1");
        } else {
            System.out.println("Conceito E");
        }

        entrada.close();
    }
}