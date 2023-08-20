package aulapratica2;

public class ClienteApp {
    public static void main(String[] args) {
        
        ClientePF clientepf1 = new ClientePF("Thuane Maria Lins", "AV cantor Evaldo Braga - Jaguarana - Paulista - PE", "66.475.658-47");
        ClientePJ clientepj1 = new ClientePJ("Thuane Produtos Med", "AV Arthur Silva -  Bairro Novo -  Olinda - PE", "66.545.425/0001-86");

        System.out.println("Cliente Pessoa Fisíca:");
        System.out.println(clientepf1.toString());
        System.out.println("Cliente Pessoa Jurídica:");
        System.out.println(clientepj1.toString());
    }
}
