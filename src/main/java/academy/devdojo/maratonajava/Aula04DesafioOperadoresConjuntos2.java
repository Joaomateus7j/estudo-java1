package academy.devdojo.maratonajava;

public class Aula04DesafioOperadoresConjuntos2 {
    public static void main(String[] args) {

        // 🛒 Exercício 1: O Sistema de Cupom de Desconto

        double valorCompra = 200;
        boolean temCupom = true;

        boolean isFrenteGratis = valorCompra >= 150 && temCupom;
        System.out.println("Ganhou fretis gratis? " + isFrenteGratis);
        valorCompra -= 20;
        System.out.println("O total aplicado com o desconto ficara de " + valorCompra);


        // 🎮 Exercício 2: O Sistema de Level Up do RPG

        int xpAtual = 850;
        boolean derrotoChefao = true;
        int multiplicadorDano = 1;

        boolean isLevelUp = xpAtual >= 1000 || derrotoChefao;
        System.out.println("Subiu de nivel? " + derrotoChefao);
        multiplicadorDano += 2;
        System.out.println("Foi acrescentado mais " + multiplicadorDano + " De xp");
    }
}
