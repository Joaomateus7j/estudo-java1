package academy.devdojo.maratonajava;

public class Aula04DesafioOperadoresConjuntos {
    public static void main(String[] args) {

        // 🏆 O Grande Desafio: O Sistema do Caixa Eletrônico

        double saldoConta = 500.00; //(O saldo que ele tem)
        double limiteDiario = 300.00; //(O máximo que ele pode sacar por dia)
        double valorSaque = 200.00; //(O valor que ele digitou para sacar)

        boolean isSaquePermetido = valorSaque <= saldoConta && valorSaque <= limiteDiario;
        System.out.println("isSaquePermetido? " + isSaquePermetido);
        saldoConta -= valorSaque;
        System.out.println("Saldo restante na conta: " + saldoConta);








    }
}
