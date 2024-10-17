import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate flugdatum = LocalDate.of(2024, 1, 20);
        Angebot angebot = new Angebot(100, flugdatum, "1");
        System.out.println(angebot);
        System.out.println(angebot.getPreisMitRabatt());
    }
}