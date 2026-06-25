package academy.devdojo.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 5;
        double numero2 = 2;
        double resultado = numero01 / numero2;
        System.out.println("O valor exibido e de " + resultado);


        // %
        int resto = 21 % 2;
        System.out.println(resto);

        //Operadores logicos
        // <><= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 15.0;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

    }
}
