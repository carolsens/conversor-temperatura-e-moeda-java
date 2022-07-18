package ProjetoSemanaSeis;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char repetirMenu = 'S';
        float temperaturaCelsius = 0.0f;
        float temperaturaFahrenheit = 0.0f;
        float conversaoparaCelsius = 0.0f;
        float conversaoparaFahrenheit = 0.0f;
        float cotacaoDolar = 0.0f;
        float moedaDolar = 0.0f;
        float conversaoparaMoedaDolar = 0.0f;
        float moedaReal = 0.0f;
        float conversaoparaMoedaReal = 0.0f;
        
        while(repetirMenu =='S' || repetirMenu == 's'){
            
            System.out.println("Ol�, voc� pode realizar as seguintes a��es:");
            System.out.println("");
            System.out.println("Para convers�o de moedas:");
            System.out.println("1 - Converter de D�LAR para REAL");        
            System.out.println("2 - Converter de REAL para D�LAR");
            System.out.println("");
            System.out.println("Para convers�o de temperaturas:");
            System.out.println("3 - Converter de CELSIUS para FAHRENHEIT");        
            System.out.println("4 - Converter de FAHRENHEIT para CELSIUS");
            System.out.println("");
            System.out.println("5 - Sair");
            System.out.println("");
            System.out.print("Digite a op��o escolhida: ");
            int opcaoMenu = sc.nextInt();
            System.out.println("");
            
            if(opcaoMenu == 1) {
                System.out.println("Voc� optou por converter D�LAR para REAL");
                System.out.println("");
                System.out.print("Preencha a cota��o atual para 1 d�lar: R$ ");
                cotacaoDolar = sc.nextFloat();
                System.out.println("");
                System.out.print("Preencha a quantidade em d�lar que você "
                        + "possui: US$ ");
                moedaDolar = sc.nextFloat();
                conversaoparaMoedaReal = moedaDolar * cotacaoDolar;
                System.out.println("");
                System.out.println("Valor em d�lar: US$ " + moedaDolar);
                System.out.println("Cota��o atual: US$ 1 equivale a R$ "
                        + cotacaoDolar);
                System.out.println("Valor convertido de d�lar para real: R$ " 
                        + conversaoparaMoedaReal);
                System.out.println("");       
            } else if(opcaoMenu == 2) {
                System.out.println("Voc� optou por converter REAL para D�LAR");
                System.out.println("");
                System.out.print("Preencha a cota��o atual para 1 d�lar: R$ ");
                cotacaoDolar = sc.nextFloat();
                System.out.println("");
                System.out.print("Preencha a quantidade em real que voc� "
                        + "possui: R$ ");
                moedaReal = sc.nextFloat();
                conversaoparaMoedaDolar = moedaReal / cotacaoDolar;
                System.out.println("");
                System.out.println("Valor em real: R$ " + moedaDolar);
                System.out.println("Cota��o atual: US$ 1 equivale a R$ "
                        + cotacaoDolar);
                System.out.println("Valor convertido de real para d�lar: US$ " 
                        + conversaoparaMoedaDolar);
                System.out.println("");    
            } else if(opcaoMenu == 3) {
                System.out.println("Voc� optou por converter CELSIUS para "
                        + "FAHREINHEIT");
                System.out.println("");
                System.out.print("Preencha a temperatura em Celsius (�C): ");
                temperaturaCelsius = sc.nextFloat();
                conversaoparaFahrenheit = (temperaturaCelsius * 9/5) + 32;
                System.out.println("");
                System.out.println("Temperatura em Celsius: " + 
                        temperaturaCelsius + " �C");
                System.out.println("Temperatura convertida de Celsius para "
                        + "Fahrenheit: " + conversaoparaFahrenheit + " �F");
                System.out.println("");
            } else if(opcaoMenu == 4) {
            System.out.println("Voc� optou por converter FAHREINHEIT para "
                    + "CELSIUS");
            System.out.println("");
            System.out.print("Preencha a temperatura em Fahreinheit "
                    + "(�F): ");
            temperaturaFahrenheit = sc.nextFloat();
            conversaoparaCelsius = (temperaturaFahrenheit - 32) * 5/9;
            System.out.println("");
            System.out.println("Temperatura em Fahrenheit: " + 
                    temperaturaFahrenheit + " �F");
            System.out.println("Temperatura convertida de Fahrenheit para "
                    + "Celsius: " + conversaoparaCelsius + " �C"); 
            System.out.println("");
            } else if(opcaoMenu != 5) {
                    System.out.println("Op��o inv�lida, por favor, tente "
                            + "novamente");
                    System.out.println("");
            }
            
        if(opcaoMenu == 5) {
            repetirMenu = 'N';  
        } else {
            System.out.println("Voc� deseja realizar outra convers�o? (S/N)");
            repetirMenu = sc.next().charAt(0);
            System.out.println("");
        } 
        
        }
        
        System.out.println("Voc� optou por n�o realizar nenhuma convers�o. "
                + "Obrigado!"); 
    }
}

