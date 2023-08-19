package exercicioprogramacao;

public class Carroapp {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Chevrolet", "Stark", "2010");
        Carro carro2 = new Carro("Fiat", "Uno", "2012");

        System.out.println("Veja nossos Carros: ");
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
    }
}
