import java.util.Scanner; // Importa la clase Scanner para leer desde la consola

public class nombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del teclado

        System.out.println("Por favor, introduce tu nombre:"); // Pide al usuario que introduzca su nombre
        String name = scanner.nextLine(); // Lee la línea completa de entrada como un String

        System.out.println("Hola, " + name + "!"); // Imprime el nombre con un saludo

        scanner.close(); // Cierra el scanner para liberar recursos
    }
}
