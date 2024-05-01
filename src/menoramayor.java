import java.util.Arrays;
import java.util.Scanner;

public class menoramayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Pedir al usuario que ingrese cinco números
        System.out.println("Ingrese cinco números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenar los números
        Arrays.sort(numeros);

        // Mostrar los números ordenados
        System.out.println("Números ordenados de menor a mayor:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
