import java.time.LocalDate;

public class MaxiDiscount extends Rabattstrategie{
    private final double rabatt = 0.3;

    public MaxiDiscount(double regulaerpreis, LocalDate flugdatum, String flugnummer, String bezeichnung) {
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
