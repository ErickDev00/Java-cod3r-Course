public class Data {
    //atributos
    Integer dia;
    Integer mes;
    Integer ano;

    Data(){
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        //chamando um construtor dentro de outro.
        this(1,1,1970);
        //apenas em métodos construtores; E o que define qual você está chamando é a quantidade de parâmetros e a ordem.
    }


    Data(Integer dia, Integer mesInicial, Integer anoInicial){
        this.dia = dia; //aqui pego a variável de instância(objeto) com this.
        mes = mesInicial;
        ano = anoInicial;
    }


    //formatando a data para string (metodo)
    //sempre estara sendo executado a partir de uma instância (objeto).
    String obterDataFormatada(){
        return String.format("%d/%d/%d", this.dia, mes, ano);
    }


    //imprimindo a data com sout metodo (menos recomendado)
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }

    static void teste(){
        //método estático é associado a classe, não podendo ser utilizado this.
    }
}
