package application;

import entities.Celular;

public class ProgramCelular {

    public static void main(String[] args) throws Exception{
        // Iphone 12, Tela de 6.1', Armazenamento de 256gb
        // Galaxy Note 20 Ultra, Tela de 6.9', Armazenamento de 256gb
        // Xiaomi Mi 11 Pro, Tela de 6.81', Armazenamento de 128gb

        Celular celularA = new Celular("Iphone 12", "IOS", 256, 6.1f);
        System.out.println(celularA);

        celularA = new Celular("Galaxy Note 20 Ultra", "Android", 256, 6.9f);
        System.out.println(celularA);

        celularA = new Celular("Xiaomi Mi 11 Pro", "Android", 128, 6.81f);
        System.out.println(celularA);

        
    }



}