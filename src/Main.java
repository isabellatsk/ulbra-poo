public class Main {
    public static void main(String[] args) {
        // criando um obj instanciado da classe filme
        Filme meuFilme = new Filme(); // tipo referencia
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 19970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacao);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        meuFilme.somaDasAvaliacao = 10;
    }
}
