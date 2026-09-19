public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("""
                Modelo: %s
                Ano: %d
                Cor: %s
                """.formatted(modelo,ano,cor));
    }

    int calcularIdade(int anoAtual){
        return anoAtual - ano;
    }

    //Teste na classe principal (mas preferi colocar aqui para visualização)
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.ano = 2007;
        carro1.cor = "Azul";

        carro1.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro1.calcularIdade(2025)+ " anos");
    }
}
