public class Calculadora {
    public int dobrarNumero(int numero) {
        return numero * 2;
    }

    //Teste na classe principal (mas preferi colocar aqui para visualização)
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println("O dobro do número é: "+ resultado);
    }
}
