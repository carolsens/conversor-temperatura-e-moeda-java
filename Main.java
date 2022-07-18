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
            
            System.out.println("Olá, você pode realizar as seguintes ações:");
            System.out.println("");
            System.out.println("Para conversão de moedas:");
            System.out.println("1 - Converter de DÓLAR para REAL");        
            System.out.println("2 - Converter de REAL para DÓLAR");
            System.out.println("");
            System.out.println("Para conversão de temperaturas:");
            System.out.println("3 - Converter de CELSIUS para FAHRENHEIT");        
            System.out.println("4 - Converter de FAHRENHEIT para CELSIUS");
            System.out.println("");
            System.out.println("5 - Sair");
            System.out.println("");
            System.out.print("Digite a opção escolhida: ");
            int opcaoMenu = sc.nextInt();
            System.out.println("");
            
            if(opcaoMenu == 1) {
                System.out.println("Você optou por converter DÓLAR para REAL");
                System.out.println("");
                System.out.print("Preencha a cotação atual para 1 dólar: R$ ");
                cotacaoDolar = sc.nextFloat();
                System.out.println("");
                System.out.print("Preencha a quantidade em dólar que vocÃª "
                        + "possui: US$ ");
                moedaDolar = sc.nextFloat();
                conversaoparaMoedaReal = moedaDolar * cotacaoDolar;
                System.out.println("");
                System.out.println("Valor em dólar: US$ " + moedaDolar);
                System.out.println("Cotação atual: US$ 1 equivale a R$ "
                        + cotacaoDolar);
                System.out.println("Valor convertido de dólar para real: R$ " 
                        + conversaoparaMoedaReal);
                System.out.println("");       
            } else if(opcaoMenu == 2) {
                System.out.println("Você optou por converter REAL para DÓLAR");
                System.out.println("");
                System.out.print("Preencha a cotação atual para 1 dólar: R$ ");
                cotacaoDolar = sc.nextFloat();
                System.out.println("");
                System.out.print("Preencha a quantidade em real que você "
                        + "possui: R$ ");
                moedaReal = sc.nextFloat();
                conversaoparaMoedaDolar = moedaReal / cotacaoDolar;
                System.out.println("");
                System.out.println("Valor em real: R$ " + moedaDolar);
                System.out.println("Cotação atual: US$ 1 equivale a R$ "
                        + cotacaoDolar);
                System.out.println("Valor convertido de real para dólar: US$ " 
                        + conversaoparaMoedaDolar);
                System.out.println("");    
            } else if(opcaoMenu == 3) {
                System.out.println("Você optou por converter CELSIUS para "
                        + "FAHREINHEIT");
                System.out.println("");
                System.out.print("Preencha a temperatura em Celsius (°C): ");
                temperaturaCelsius = sc.nextFloat();
                conversaoparaFahrenheit = (temperaturaCelsius * 9/5) + 32;
                System.out.println("");
                System.out.println("Temperatura em Celsius: " + 
                        temperaturaCelsius + " °C");
                System.out.println("Temperatura convertida de Celsius para "
                        + "Fahrenheit: " + conversaoparaFahrenheit + " °F");
                System.out.println("");
            } else if(opcaoMenu == 4) {
            System.out.println("Você optou por converter FAHREINHEIT para "
                    + "CELSIUS");
            System.out.println("");
            System.out.print("Preencha a temperatura em Fahreinheit "
                    + "(°F): ");
            temperaturaFahrenheit = sc.nextFloat();
            conversaoparaCelsius = (temperaturaFahrenheit - 32) * 5/9;
            System.out.println("");
            System.out.println("Temperatura em Fahrenheit: " + 
                    temperaturaFahrenheit + " °F");
            System.out.println("Temperatura convertida de Fahrenheit para "
                    + "Celsius: " + conversaoparaCelsius + " °C"); 
            System.out.println("");
            } else if(opcaoMenu != 5) {
                    System.out.println("Opção inválida, por favor, tente "
                            + "novamente");
                    System.out.println("");
            }
            
        if(opcaoMenu == 5) {
            repetirMenu = 'N';  
        } else {
            System.out.println("Você deseja realizar outra conversão? (S/N)");
            repetirMenu = sc.next().charAt(0);
            System.out.println("");
        } 
        
        }
        
        System.out.println("Você optou por não realizar nenhuma conversão. "
                + "Obrigado!"); 
    }
}

