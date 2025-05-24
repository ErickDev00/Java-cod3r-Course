import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo"); //é put porque na segunda vez ele substitui ao invés de adicionar um novo.
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.keySet()); //não mantém as chaves ordenadas por padrão.
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20)); //true.
        System.out.println(usuarios.containsValue("Rebeca")); //true.

        System.out.println(usuarios.get(20)); //Ricardo
        System.out.println(usuarios.remove(1)); //Remove Roberto.

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + "->");
            System.out.println(registro.getValue());
        }


    }
}
