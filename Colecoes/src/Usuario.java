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
}
