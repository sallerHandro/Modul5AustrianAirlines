import java.time.LocalDate;

public class MidiDiscount extends Rabattstrategie{
    private final double rabatt = 0.15;

    public MidiDiscount(double regulaerpreis, LocalDate flugdatum, String flugnummer, String bezeichnung) {
        super(regulaerpreis, flugdatum, flugnummer, bezeichnung);
    }

    @Override
    public double getReduzierterPreis(double regulaerPreis) {
        return regulaerPreis * (1-this.rabatt);
    }

    public double getRabatt() {
        return rabatt;
    }
}
