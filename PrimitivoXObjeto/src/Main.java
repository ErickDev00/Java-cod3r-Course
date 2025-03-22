import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "texto"; //isso é um objeto.

        int a = 123; //isso é um tipo primitivo (não tem notação ponto e só carrega o valor. ex: a.)

        //Wrappers (versão objeto dos tipos primitivos)

        Scanner entrada = new Scanner(System.in);

        Byte b = 100;
        Short c = 1000;


        Integer i = Integer.parseInt(entrada.next());
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*3);

        entrada.close();
    }
}