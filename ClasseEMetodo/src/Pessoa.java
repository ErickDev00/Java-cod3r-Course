public class Pessoa {
    String nomePessoa;
    Double pesoPessoa;

    //construtor
    Pessoa(String nomePessoa, Double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    //método
    void Comer(Pessoa pessoa, Comida comida ){
        Double novoPeso = pessoa.pesoPessoa + comida.pesoComida;
        System.out.println("Seu peso atual é " + pessoa.pesoPessoa);
        System.out.println("Olá " + pessoa.nomePessoa + " Seu novo peso, após comer " + comida.nomeComida + " é de " + novoPeso);
    };

    void Comer(Pessoa pessoa, Comida comida, Comida comida2){
        Double novoPeso = pessoa.pesoPessoa + comida.pesoComida + comida2.pesoComida;
        System.out.println("Seu peso atual é " + pessoa.pesoPessoa);
        System.out.println("Olá " + pessoa.nomePessoa + " Seu novo peso, após comer " + comida.nomeComida + " e " + comida2.nomeComida + " é de " + novoPeso);
    }


}
