import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        //sera executada pelo menos uma vez

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            //essa parte é executada pelo menos uma vez.
            System.out.println("Fale a frase de gentileza:");
            System.out.print("Quer sair?");

            texto = entrada.nextLine();


        } while (!texto.equalsIgnoreCase("por favor"));


        System.out.println("Obrigado!");
        entrada.close();

    }
}
