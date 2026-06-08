package academy.devdojo.maratonajava;

public class Aula04OperadoresExercicio {
    public static void main(String[] args) {
        int idadeCliente = 17;
        int idadeMinimaParaDirigir = 18;


        boolean isClienteMaiorDeIdade = idadeCliente >= idadeMinimaParaDirigir;
        boolean isIdadeDiferente = idadeCliente != idadeMinimaParaDirigir;

        System.out.println("isClienteMaiorDeIdade: " + isClienteMaiorDeIdade);
        System.out.println("isIdadeDiferente: " + isIdadeDiferente);



    }
}
