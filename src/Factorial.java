import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            long factorial = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es " + factorial);
        } else {
            System.out.println("Por favor ingrese un número no negativo.");
        }

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        if (n == 0) {  // El factorial de 0 es 1
            return 1;
        } else {
            return n * calcularFactorial(n - 1); // Llamada recursiva
        }
    }
}
