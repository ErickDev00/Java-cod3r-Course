import java.util.HashSet;
import java.util.Set;

public class ConjuntosDiversos {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //converte o double para classe Double.
        conjunto.add(true); //boolean -> Boolean.
        conjunto.add("teste");


        System.out.println("Tamanho é " + conjunto.size());
        //não aceita elementos repetidos.
        System.out.println(conjunto.remove("teste")); //consegue remover, é case sensitive.

        System.out.println(conjunto.contains("a")); //verifica se o conjunto contém a.

        Set nums = new HashSet(); //também é válido.
        nums.add(1);
        nums.add(2);
        nums.add(3);

        conjunto.addAll(nums); //Une tudo de nums em conjunto.
        conjunto.retainAll(nums); //Retém apenas o que os conjuntos tem em comum.


        conjunto.clear(); //Limpa o conjunto por completo.

    }
}