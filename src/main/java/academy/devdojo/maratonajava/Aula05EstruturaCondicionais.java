package academy.devdojo.maratonajava;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {

        int idade = 19;
        boolean isAutorizadoComprarBebida = idade >=18;
        // !
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida ");
        }else{
            System.out.println("Não Autorizado a comprar bebida ");
        }

        int idade2 = 18;
        boolean completouAlistamento = false;

        if (!completouAlistamento){
            System.out.println("Você precisa realizar o seu alistamento militar obrigatório! ");
        }



    }
}
