package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno al1 = new Aluno("Ana", 7.1);
        Aluno al2 = new Aluno("Teste2", 6.1);
        Aluno al3 = new Aluno("Aluno3", 8.1);
        Aluno al4 = new Aluno("Aluno4", 10);
        Aluno al5 = new Aluno("Ana", 7.1);
        Aluno al6 = new Aluno("Teste2", 6.1);
        Aluno al7 = new Aluno("Aluno3", 8.1);
        Aluno al8 = new Aluno("Aluno4", 10);

        List<Aluno> alunos = Arrays.asList(al1, al2, al3, al4, al5, al6, al7, al8);

        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\n Skip-Limit");
        alunos.stream()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\n takeWhile");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a-> a.nota >= 7)
                .forEach(System.out::println);






    }
}
