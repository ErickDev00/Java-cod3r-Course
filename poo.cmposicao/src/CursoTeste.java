public class CursoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Bob Marley");
        Aluno aluno3 = new Aluno("Michael Jackson");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 20");
        Curso curso3 = new Curso("Kotlin");


        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno3);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);


        for (Aluno aluno: curso1.alunos){
            System.out.println("Estou no curso 1, e meu nome é " + aluno.nome);
            System.out.println();
        }


        System.out.println(aluno1.cursos.get(0).alunos);

        //buscando alunos pelo nome do curso.
        Curso cursoEncotrado = aluno1.obterCursoPorNome("Web 20");
        if (cursoEncotrado != null){
            System.out.println(cursoEncotrado.alunos);
        }

    }

}
