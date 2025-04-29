import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.print("Informe a nota:");

        int nota = entrada.nextInt();

        switch(nota){
            case 10: case 9:
                conceito = "A";
            break;

            case 8: case 7:
                conceito = "B";
                break;
        }

        System.out.println("Conceito é" + conceito);
        entrada.close();



    }
}
