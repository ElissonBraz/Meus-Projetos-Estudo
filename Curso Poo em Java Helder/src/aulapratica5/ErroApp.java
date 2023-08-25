package aulapratica5;

public class ErroApp {

    public static void main(String[] args) {

        int valor1, valor2;

        valor1 = 10;
        valor2 = 10;

        double resultado;

        try {
            resultado = valor1 / valor2;
            System.out.println("O resultado foi: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("Erro de Divisão por zero "+ ae.getMessage());
        }
        finally {
            System.out.println("Sou executado sempre!");
        }

    }

}