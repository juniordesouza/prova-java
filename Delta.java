import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o X: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o Y: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o Z: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - 4 * a * c;

        System.out.printf("O valor de Delta é: %.2f", delta);

        scanner.close();
    }
}
