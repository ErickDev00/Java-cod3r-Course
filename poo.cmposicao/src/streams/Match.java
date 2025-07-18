package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Teste2", 6.1);
        Aluno a3 = new Aluno("Aluno3", 8.1);
        Aluno a4 = new Aluno("Aluno4", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        //selecionando apenas os alunos aprovados:
        Predicate<Aluno> aprovado = a -> a.nota >= 7;


        System.out.println(alunos.stream().allMatch(aprovado)); //se todos os alunos foram aprovados.
        System.out.println(alunos.stream().anyMatch(aprovado)); //tem algum aprovado?
        //System.out.println(alunos.stream().noneMatch(aprovado.negate()));






    }

}
