import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    List<Curso> cursos = new ArrayList<>();

    //construtor aluno.
    Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome){
        for (Curso curso: this.cursos){
            if (curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    public String toString(){ //converter objeto para string.
        return nome;
    }



}
