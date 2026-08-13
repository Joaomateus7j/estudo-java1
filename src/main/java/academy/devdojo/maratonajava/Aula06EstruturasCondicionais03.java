package academy.devdojo.maratonajava;

public class Aula06EstruturasCondicionais03 {
    static void main(String[] args) {
        double salario = 5000;
        String mensagemDoar = "Eu vou dor 500 reais para o Devdojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas ainda vou ter";
        String resultado;


        if(salario >= 5000) {
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;

        }
        System.out.println(resultado);


    }
}
