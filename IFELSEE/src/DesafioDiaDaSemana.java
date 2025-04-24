import java.util.Scanner;

public class DesafioDiaDaSemana {

    public static void main(String[] args){

        //domingo - 1 / segunda -2 / terça - 3
        Scanner entradaDia = new Scanner(System.in);

        System.out.print("Digite o dia da semana. Ex: Segunda.");
        String dia = entradaDia.next();

        if (dia.equalsIgnoreCase("domingo") ){
            System.out.println("1");
        } else if (dia.equalsIgnoreCase("segunda") ){
            System.out.println("2");
        } else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)){
            System.out.println("3");
        } else if ("quarta".equalsIgnoreCase(dia)){
            System.out.println("4");
        } else if ("quinta".equalsIgnoreCase(dia)){
            System.out.println("5");
        } else if ("sexta".equalsIgnoreCase(dia)){
            System.out.println("6");
        } else if(dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")){
            System.out.println("7");
        } else {
            System.out.println("Dia Inválido.");
        }

        entradaDia.close();




    }
}
