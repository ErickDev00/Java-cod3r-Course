import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> filaInicial = new LinkedList<>(); //linkedList aceita tudo.

        filaInicial.add("João"); //aqui caso nao consiga adicionar gera erro.

        //diferença é o comportamento quando a fila está cheia.

        filaInicial.offer("Bia");
        filaInicial.offer("José");
        filaInicial.offer("Messi");
        filaInicial.offer("Ronaldo");
        filaInicial.offer("Ronaldinho");


        //a diferença entre os dois ocorre quando a fila esta vazia.

        //os dois obtém o próximo elemento da fila sem remover.
        System.out.println(filaInicial.peek()); //caso não tiver ninguém na fila retorna nulo.
        System.out.println(filaInicial.element()); //gera erro de excessão.

        //filaInicial.size();
        //filaInicial.clear();
        //filaInicial.isEmpty();
        //filaInicial.remove();

        System.out.println(filaInicial.poll()); //retorna o primeiro elemento da fila já removendo.
        System.out.println(filaInicial.remove()); //se a fila estiver vazia lança exception.

        //filaInicial.contains();

    }
}
