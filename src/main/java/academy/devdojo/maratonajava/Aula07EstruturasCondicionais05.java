package academy.devdojo.maratonajava;

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
    }
}
