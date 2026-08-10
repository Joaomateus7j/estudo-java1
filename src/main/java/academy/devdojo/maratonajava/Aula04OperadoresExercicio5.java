package academy.devdojo.maratonajava;

public class Aula04OperadoresExercicio5 {
    public static void main(String[] args) {

        // 🧠 Tema 2: Operadores Lógicos (Exercício 1)

        boolean isNaLista = true;
        boolean temConvite = true;
        boolean isAcessoLiberado = isNaLista && temConvite;
        System.out.println("isAcessoLiberado? " + isAcessoLiberado);

        // 🧠 Tema 2: Operadores Lógicos (Exercício 2 e aplicando)

        boolean isChovendo = false;
        int velocidadeVento = 65;
        boolean isTrabalhoCancelado = isChovendo || velocidadeVento >= 50;
        System.out.println("isTrabalhoCancelado? " + isTrabalhoCancelado);

    }
}
