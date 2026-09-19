public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.printf("""
                Titulo: %s
                Artista: %s
                Ano de lançamento: %d
                Avaliação: %.2f
                Número avaliação: %d
                %n""", titulo, artista, anoLancamento, somaDasAvaliacoes, numAvaliacoes);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / numAvaliacoes;
    }

    //Teste na classe principal (mas preferi colocar aqui para visualização)
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Nome da Música";
        minhaMusica.artista = "Nome do Artista";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        minhaMusica.exibeFichaTecnica();

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.printf("Média das avaliações: %.2f", mediaAvaliacoes);
    }
}
