public class Pessoa {
    //Atributos
    String nome;
    int idade;

    //Constructor para passar parâmetros
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Metodos
    void falar(){
        System.out.println("Olá, eu sou "+this.nome);
    }

    void exibir(){
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade);
    }

    //Teste na classe principal (mas preferi colocar aqui para visualização)
    public static void main(String[] args) {
        //Criando obj instanciado da classe Pessoa
        Pessoa pessoa = new Pessoa("Yuri", 23);
        pessoa.exibir();
        pessoa.falar();
    }
}
