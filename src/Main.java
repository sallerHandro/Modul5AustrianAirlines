import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate flugdatum = LocalDate.of(2024, 1, 20);
        Angebot angebot;

        if (flugdatum.getMonth().getValue() == 1 || flugdatum.getMonth().getValue() == 4 || flugdatum.getMonth().getValue() == 10){
            angebot = new MaxiDiscount(100, flugdatum, "1", "Cooler Flug");
        }
    }
}