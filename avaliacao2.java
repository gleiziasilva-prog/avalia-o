import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = entrada.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        // Saída de resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        entrada.close();
    }
}
