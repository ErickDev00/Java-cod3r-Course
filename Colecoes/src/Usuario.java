import java.util.Objects;

public class Usuario {
    String nome;
    String email;
    int idade;


    Usuario(){
    };

    Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    Usuario(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


    //para que no momento que seja impressa String do usuário:
    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ", e meu email é: " + this.email + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idade == usuario.idade && Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, idade);
    }
}
