import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;
    final List<Aluno> alunos = new ArrayList<>(); //os elementos dentro não são constantes, mas o end de memória sim.

    Curso(String nome){
        this.nome = nome;
    }

    //métodos para adicionar os alunos na lista.
    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }



}
