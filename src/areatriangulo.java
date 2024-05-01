import java.util.Scanner;

public class areatriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las longitudes de los lados del triángulo
        System.out.println("Ingrese la longitud del lado a:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese la longitud del lado b:");
        double b = scanner.nextDouble();

        System.out.println("Ingrese la longitud del lado c:");
        double c = scanner.nextDouble();

        // Calcular el semiperímetro
        double s = (a + b + c) / 2;

        // Calcular el área utilizando la fórmula de Herón
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Mostrar el resultado
        System.out.printf("El área del triángulo es: %.2f%n", area);

        scanner.close();
    }
}
