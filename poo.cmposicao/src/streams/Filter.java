package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.9);
        Aluno a2 = new Aluno("Bia", 9.2);
        Aluno a3 = new Aluno("Java", 10.0);


        List<Aluno> alunos = Arrays.asList(a1, a2, a3);


        alunos.stream().filter(a -> a.nota >= 7)
                .map(a-> "Parabens " + a.nome + " Aprovado ")
                .forEach(System.out::println);








    }
}
