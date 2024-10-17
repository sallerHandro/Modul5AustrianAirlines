import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate flugdatum = LocalDate.of(2024, 1, 20);
        Angebot angebot = new Angebot(100,flugdatum,"1");
        System.out.println("Aufgrund ihrer Buchun im: " + angebot.getFlugdatum().getMonth() + " erhalten Sie auf Ihren Regulärpreis von: "
        + angebot.getRegulaerpreis() + "€ einen Rabatt!\n" + "Somit eträgt ihr neuer Betrag: " + angebot.getReduzierterPreis());
        System.out.println("Regulärer Preis: " + angebot.getRegulaerpreis());
        System.out.println("Reduzierter Preis: " + angebot.getReduzierterPreis());




    }
}