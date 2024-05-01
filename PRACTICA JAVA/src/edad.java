import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class edad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita la fecha de nacimiento
        System.out.println("Introduce tu fecha de nacimiento (formato YYYY-MM-DD):");
        String input = scanner.nextLine();

        // Convierte la entrada en un objeto LocalDate
        LocalDate birthDate = LocalDate.parse(input);

        // Obtiene la fecha actual
        LocalDate currentDate = LocalDate.now();

        // Calcula la diferencia en días
        long days = ChronoUnit.DAYS.between(birthDate, currentDate);

        // Muestra el resultado
        System.out.println("Has vivido " + days + " días.");
    }
}
