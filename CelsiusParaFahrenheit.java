import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.2f°C é equivalente a %.2f°F%n", celsius, fahrenheit);

        scanner.close();
    }
}