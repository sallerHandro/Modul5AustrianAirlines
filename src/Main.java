import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate flugdatum = LocalDate.of(2024, 1, 20);
        Rabattstrategie rabattstrategie;

        if (flugdatum.getMonth().getValue() == 1 || flugdatum.getMonth().getValue() == 4 || flugdatum.getMonth().getValue() == 10){
            rabattstrategie = new MaxiDiscount(100, flugdatum, "1", "Maximaler Rabatt");
        } else if (flugdatum.getMonth().getValue() == 2 || flugdatum.getMonth().getValue() == 3) {
            rabattstrategie = new MidiDiscount(100, flugdatum, "2", "Mittlerer Rabatt");
        } else {
            rabattstrategie = new ZeroDiscount(100, flugdatum, "3", "Kein Rabatt");
        }
        System.out.println(rabattstrategie);
    }
}