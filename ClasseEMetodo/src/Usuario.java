public class Usuario {
    String nome;
    String email;



    public boolean equals(Object objeto) { //atalho eq.

        if (objeto instanceof Usuario){ //esse if garante que o equals está recebendo um objeto moldado como Usuario.
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual= outro.nome.equals(this.nome); //forma mais adequada.
            boolean emailIgual = outro.email == this.email;

            return nomeIgual && emailIgual;

        } else {
            return false;
        }
    }
}
