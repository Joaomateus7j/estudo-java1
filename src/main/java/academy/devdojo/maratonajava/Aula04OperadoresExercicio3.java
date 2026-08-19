package academy.devdojo.maratonajava;

public class Aula04OperadoresExercicio3 {
    public static void main(String[] args) {

        boolean isContaVerificada = true;
        double salarioCliente = 3500;
        double limiteCartao = 1000;

        boolean isAumentoAprovado = isContaVerificada && salarioCliente >= 2400;
        limiteCartao += 1500;
        System.out.println("O aumento foi aprovado ? teste1  " + isAumentoAprovado);
        System.out.println("Novo limite do cartão: " + limiteCartao);
    }
}
