import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate flugdatum = LocalDate.of(2024, 6, 20);
        Angebot angebot = new Rabattstrategie(100, flugdatum, "1");
        System.out.println(angebot);
        System.out.println(((Rabattstrategie) angebot).getReduziertenPreis());
    }
}