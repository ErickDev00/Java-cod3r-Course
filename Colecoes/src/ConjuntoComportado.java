import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        //Set<String> lista = new HashSet<>(); //obrigatório conjunto do tipo String.
        Set<String> lista = new TreeSet<>(); //TreeSet garante a ordem (também tem a possibildiade de SortedSet).
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Junior");
        lista.add("Mary Jane");

        for (String candidato: lista){
            System.out.println(candidato);
        }

    }
}
