package academy.devdojo.maratonajava;

public class Aula04OperadoresExercicio {
    public static void main(String[] args) {

        // --- TESTE 1: CÁLCULO DA IDADE DO CLIENTE ---
        int idadeCliente = 17;
        int idadeMinimaParaDirigir = 18;

        boolean isClienteMaiorDeIdade = idadeCliente >= idadeMinimaParaDirigir;
        boolean isIdadeDiferente = idadeCliente != idadeMinimaParaDirigir;

        System.out.println("isClienteMaiorDeIdade: " + isClienteMaiorDeIdade);
        System.out.println("isIdadeDiferente: " + isIdadeDiferente);


        // --- TESTE 2: CÁLCULO DA LEI E SALÁRIO ---
        int idade = 35;
        float salario = 3500f;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 35 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);


        // --- TESTE 3: COMPRA DAS FRUTAS ---
        boolean compreiMorangoHoje = true;
        boolean compreiAbacaxiHoje = true;

        boolean isCompraFeitaDoDia = compreiMorangoHoje && compreiAbacaxiHoje;

        System.out.println("Eu comprei o que era necessario hoje? " + isCompraFeitaDoDia);

    } // <- Essa chave fecha o main (estava faltando ou no lugar errado)
} // <- Essa chave fecha a classe