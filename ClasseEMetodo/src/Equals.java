public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Mathias";
        u1.email = "mathias.bope@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Mathias";
        u2.email = "mathias.bope@gmail.com";

        System.out.println(u1 == u2); //retorna falso porque compara endereço de memória.
        System.out.println(u1.equals(u2)); //equals por padrão faz a mesma comparação por memória.





    }
}
