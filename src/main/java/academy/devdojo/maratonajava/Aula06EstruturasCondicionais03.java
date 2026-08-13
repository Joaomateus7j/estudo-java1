package academy.devdojo.maratonajava;

public class Aula06EstruturasCondicionais03 {
    static void main(String[] args) {
        double salario = 5001;
        String mensagemDoar = "Eu vou dor 500 reais para o Devdojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas ainda vou ter";
        // (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;


        System.out.println(resultado);


    }
}
