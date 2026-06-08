package academy.devdojo.maratonajava;

public class Aula04OperadoresExercicio {
    public static void main(String[] args) {
        int idadeCliente = 17;
        int idadeMinimaParaDirigir = 18;


        boolean isClienteMaiorDeIdade = idadeCliente >= idadeMinimaParaDirigir;
        boolean isIdadeDiferente = idadeCliente != idadeMinimaParaDirigir;

        System.out.println("isClienteMaiorDeIdade: " + isClienteMaiorDeIdade);
        System.out.println("isIdadeDiferente: " + isIdadeDiferente);



        // && =(AND) || (or) !
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaioroQueTrinta = idade > 35 && salario > 4612;
        boolean isDentroDaLeiMenoroQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaioroQueTrinta "+ isDentroDaLeiMaioroQueTrinta);
        System.out.println("isDentroDaLeiMenoroQueTrinta "+ isDentroDaLeiMenoroQueTrinta);



    }
}
