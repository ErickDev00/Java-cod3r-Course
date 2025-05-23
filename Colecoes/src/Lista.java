import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario Ana = new Usuario("Ana", "ana@gmail.com", 32);
        lista.add(Ana);


        lista.add(new Usuario("Erick","er@gmail.com", 23));
        lista.add(new Usuario("Samira","er4444@gmail.com", 21));
        lista.add(new Usuario("Messi","er5454@gmail.com", 44));
        lista.add(new Usuario("Cristiano Ronaldo","er5555@gmail.com", 57));


        System.out.println(lista.get(3).nome); //acessando pelo indice.


        for(Usuario u: lista){
            System.out.println(u.nome);
        }
        System.out.println();

        for(Usuario u: lista){
            System.out.println(u);
        }


    }
}
