package academy.devdojo.maratonajava;

/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome> morando no endereço <endereço>
confirmo que recebi o salario de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        //--- Variáveis de Texto
        String nome = "João mateus";
        String endereco = "Rua simplico de souza euflasio, 450";
        String data = "06/06/2026";
        //Variáveis Numéricas
        double salario = 2500.50;

        System.out.println("Eu " + nome + ", Morando no endereço "+ endereco+ ", Confirmo que recebi o salário de " +salario+ ", Na data de " + data);



    }
}