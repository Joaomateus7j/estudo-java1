package academy.devdojo.maratonajava;

public class Aula04OperadoresExercicio1 {
    public static void main(String[] args) {

        double valorTotalContaCorrente = 200;
        double ValorTotalContapoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || ValorTotalContapoupanca > valorPlaystation;
        System.out.println("Foi aprovado a venda do Playstation sim ou nao, alteraçãoo  " +isPlaystationCincoCompravel );
    }
}
