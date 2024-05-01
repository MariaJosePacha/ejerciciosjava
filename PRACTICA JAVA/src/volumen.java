import java.util.Scanner;

public class volumen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Introduce el radio de la esfera: ");
        double radio = scanner.nextDouble();  // Lee el radio desde la consola

        // Calcula el volumen de la esfera usando la fórmula (4/3) * pi * r^3
        double volumen = (4.0 / 3) * Math.PI * Math.pow(radio, 3);

        // Imprime el resultado
        System.out.printf("El volumen de la esfera es: %.2f\n", volumen);
    }
}
