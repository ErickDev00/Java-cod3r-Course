import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 2;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i=0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        System.out.println(total/ notasAlunoA.length);


        //outra maneira

        double notaArmazenada = 6.9; //ex
        double[] notasAlunoB = {notaArmazenada, 8.9, 10, 6.9};

        double totalAlunoB = 0;

        for (int i=0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);

    }
}