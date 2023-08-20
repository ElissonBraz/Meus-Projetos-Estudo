package aulapratica3;

public class ContaCorrenteApp {
    
    public static void main(String[] args) {
        
       ContaCorrente contacomun = new ContaCorrente(35, 457);
       ContaCorrente contaespecial = new ContaCorrente(36, 457, 10000.00f);
       
       System.out.println(contacomun);
       System.out.println(contaespecial);
    }
}
