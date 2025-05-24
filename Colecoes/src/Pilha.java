import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        //last in first out, último a entrar é o primeiro a sair.

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Nada pode me ferir");
        livros.push("O investidor inteligente");
        livros.push("O Hobbit");

        System.out.println(livros.peek()); //console -> O Hobbit

        for (String livro: livros){
            System.out.println(livro);
        }





    }
}
