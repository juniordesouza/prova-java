import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        double quadrado = valor * valor;
        double cubo = quadrado * valor;

        System.out.printf("Quadrado: %.2f\nCubo: %.2f", quadrado, cubo);

        scanner.close();

    }
}
