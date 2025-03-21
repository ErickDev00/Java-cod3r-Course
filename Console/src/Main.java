import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Bom");

        System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Nome " + nome);
    }
}