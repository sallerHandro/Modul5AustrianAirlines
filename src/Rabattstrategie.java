import java.time.LocalDate;

public class Rabattstrategie extends Angebot{

    private final double rabatt;

    public Rabattstrategie(double regulaerpreis, LocalDate flugdatum, String flugnummer) {
        super(regulaerpreis, flugdatum, flugnummer);
        this.rabatt = setRabatt();
    }

    private double setRabatt() {
        if (super.getFlugdatum().getMonth().getValue() == 1 || super.getFlugdatum().getMonth().getValue() == 4 || super.getFlugdatum().getMonth().getValue() == 10) {
            return Rabattart.MAXI.getRabatt();
        } else if (super.getFlugdatum().getMonth().getValue() == 2 || super.getFlugdatum().getMonth().getValue() == 3) {
            return Rabattart.MIDI.getRabatt();
        } else {
            return Rabattart.ZERO.getRabatt();
        }
    }

    public double getReduziertenPreis() {
        return super.getRegulaerpreis() * (1 - this.rabatt);
    }

    public double getRabatt() {
        return rabatt;
    }

    @Override
    public String toString() {
        return "Rabattstrategie{" +
                "rabatt=" + rabatt +
                '}';
    }
}
