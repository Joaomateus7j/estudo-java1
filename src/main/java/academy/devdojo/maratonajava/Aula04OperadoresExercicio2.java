package academy.devdojo.maratonajava;

public class Aula04OperadoresExercicio2 {
    public static void main(String[] args) {

        boolean isEstudante = false;
        int idade = 19;

        boolean isMeiaEntrada = isEstudante || idade < 21;
        System.out.println("Tem direito a meia-entrada? " + isMeiaEntrada);


        // Operadores de atribuição
        // = += -= *= /= %=

        double bonus = 1800; // 1800 que ele já tava
        bonus += 2000; // ele somou os 1800 mais os 2000 de bonus e ficou 3800
        bonus -= 1000; // Ai no segundo bonus ele viu que ta 3800 e subtraiu e deixou 2800
        bonus *= 2; // Ele vai pegar o * mais o valor que adaadavocê colocou e vai multiplicar por ele mesmo
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        System.out.println(contador);
    }
}
