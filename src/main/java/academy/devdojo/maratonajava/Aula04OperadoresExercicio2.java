package academy.devdojo.maratonajava;

public class Aula04OperadoresExercicio2 {
    public static void main(String[] args) {

        boolean isEstudante = false;
        int idade = 40;

        boolean isMeiaEntrada = isEstudante || idade < 21;
        System.out.println("Tem direito a meia-entrada? " + isMeiaEntrada);
    }
}
