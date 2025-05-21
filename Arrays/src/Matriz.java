import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdNotas = entrada.nextInt();

        double[][] AlunosENotas = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int a=0; a < AlunosENotas.length; a++){

            //para cada aluno é realizado o for abaixo:
            for (int n=0; n < AlunosENotas[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                AlunosENotas[a][n] = entrada.nextDouble();
                total += AlunosENotas[a][n];

            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é " + media);

        for (double[] notasDoAluno: AlunosENotas){
            System.out.println(Arrays.toString(AlunosENotas));
        }


        entrada.close();

    }
}
