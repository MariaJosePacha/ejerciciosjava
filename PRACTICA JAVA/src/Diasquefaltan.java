import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Diasquefaltan {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Define las fechas de los eventos
        LocalDate diaDeMuertos = LocalDate.of(today.getYear(), 11, 2);
        LocalDate navidad = LocalDate.of(today.getYear(), 12, 25);

        // Si el día de hoy es después del día de muertos, calcula para el próximo año
        if (today.isAfter(diaDeMuertos)) {
            diaDeMuertos = diaDeMuertos.plusYears(1);
        }

        // Si el día de hoy es después de navidad, calcula para el próximo año
        if (today.isAfter(navidad)) {
            navidad = navidad.plusYears(1);
        }

        // Calcula los días que faltan para cada evento
        long diasParaDiaDeMuertos = ChronoUnit.DAYS.between(today, diaDeMuertos);
        long diasParaNavidad = ChronoUnit.DAYS.between(today, navidad);

        // Imprime los resultados
        System.out.println("Días restantes hasta el Día de Muertos: " + diasParaDiaDeMuertos);
        System.out.println("Días restantes hasta Navidad: " + diasParaNavidad);
    }
}

