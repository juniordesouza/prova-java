import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a Altura: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("Area do Triangulo: %.2f", area);

        scanner.close();

    }
}
