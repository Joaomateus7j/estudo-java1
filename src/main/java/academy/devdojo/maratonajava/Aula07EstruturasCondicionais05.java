package academy.devdojo.maratonajava;

import java.sql.SQLOutput;

public class Aula07EstruturasCondicionais05 {
    static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo

        byte dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
        }




        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Invalido");
                break;
        }



    }
}



