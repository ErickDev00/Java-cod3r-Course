package excecao;

public class Basico {


    public static void main(String[] args) {

        Aluno a1 = null;

        try{
            imprimirNome(a1);

        } catch (Exception e){
            System.out.println("Ocorreu um erro na hora de imprimir o nome");
        }


        try{
            System.out.println(7 / 0);

        } catch (ArithmeticException excecao){
            System.out.println("Ocorreu um erro" + excecao.getMessage());
        }

    }

    public static void imprimirNome(Aluno aluno){
        System.out.println(aluno.nome);
    }




}
