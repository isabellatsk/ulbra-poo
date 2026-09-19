public class Filme {//Classe Filme
    //Aqui vai atributos e métodos da classe, fora do main

    //Atributos da classe
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //Métodos da classe
    void exibeFichaTecnica(){// quando ele não devolve nada pra quem chamou é só void
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacao / totalDeAvaliacoes; //Pra retornar, devolver algo
    }
}
