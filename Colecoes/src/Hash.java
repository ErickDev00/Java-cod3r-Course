import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Erick", "er@gmail.com", 23));
        usuarios.add(new Usuario("Samira", "sp@gmail.com", 22));
        usuarios.add(new Usuario("Messi", "ms@gmail.com", 38));

        System.out.println(usuarios.contains(new Usuario("Nascimento", "cpnasc@gmail.com", 43)));
        //false
        System.out.println(usuarios.contains(new Usuario("Erick", "er@gmail.com", 23)));
        //true







    }
}
