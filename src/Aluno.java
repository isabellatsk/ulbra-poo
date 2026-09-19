public class Aluno {
    String nome;
    int idade;

    void exibeInformacoesDoAluno(){
        System.out.println("""
                Nome: %s
                Idade: %d
                """.formatted(nome, idade));
    }

    //Teste na classe principal (mas preferi colocar aqui para visualização)
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Juan";
        aluno1.idade = 22;

        aluno1.exibeInformacoesDoAluno();
    }
}