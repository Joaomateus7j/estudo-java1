package academy.devdojo.maratonajava;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {

        int idade = 17;
        boolean isAutorizaComprarBebida = idade >= 18;

        // ! 

        if(isAutorizaComprarBebida ){
            System.out.println("Pode comprar a bebida");
        }
        else{
            System.out.println("Você nao possui idade para comprar bebida");
        }


    }
}
