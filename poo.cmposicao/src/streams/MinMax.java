package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
    public static void main(String[] args) {

        Aluno al1 = new Aluno("Ana", 7.1);
        Aluno al2 = new Aluno("Teste2", 6.1);
        Aluno al3 = new Aluno("Aluno3", 8.1);
        Aluno al4 = new Aluno("Aluno4", 10);

        List<Aluno> alunos = Arrays.asList(al1, al2, al3, al4);

        //selecionando apenas os alunos aprovados:
        Predicate<Aluno> aprovado = a -> a.nota >= 7;


        Comparator<Aluno> melhorNota = (a1, a2) -> {
            if (a1.nota > a2.nota) return 1;
            if (a1.nota < a2.nota) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());





    }
}
