public class Foreach {
    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4};

        //percorrer um array inteiro;
        for (double nota: notas){
            System.out.print(nota + " ");
        }

        System.out.println();

        for (int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }
    }
}
