package encapsulamento;

public class Pessoa {
    private int idade;

    public Pessoa(int idade){
        setIdade(idade);
    }

    //altera
    public void setIdade(int novaIdade){
        if (novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        } else {
            System.out.println("idade inválida!");
        }
    }

    //lê
    public int getIdade(){
        return idade;
    }

}
