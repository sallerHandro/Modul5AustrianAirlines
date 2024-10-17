import java.time.LocalDate;

public class Angebot {
    private double regulaerpreis;
    private LocalDate flugdatum;
    private String flugnummer;
    private Rabattstrategie rabattstrategie;

    public Angebot(double regulaerpreis, LocalDate flugdatum, String flugnummer) {
        this.regulaerpreis = regulaerpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
        this.rabattstrategie = setRabattstrategie();
    }

    private Rabattstrategie setRabattstrategie() {
        if (flugdatum.getMonth().getValue() == 1 || flugdatum.getMonth().getValue() == 4 || flugdatum.getMonth().getValue() == 10) {
            return new Rabattstrategie(Rabattart.MAXI.getRabatt());
        } else if (flugdatum.getMonth().getValue() == 2 || flugdatum.getMonth().getValue() == 3) {
            return new Rabattstrategie(Rabattart.MIDI.getRabatt());
        } else {
            return new Rabattstrategie(Rabattart.ZERO.getRabatt());
        }
    }

    public double getRegulaerpreis() {
        return regulaerpreis;
    }

    public void setRegulaerpreis(double regulaerpreis) {
        this.regulaerpreis = regulaerpreis;
    }

    public LocalDate getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(LocalDate flugdatum) {
        this.flugdatum = flugdatum;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        this.flugnummer = flugnummer;
    }

    public double getPreisMitRabatt(){
        return this.regulaerpreis * (1-rabattstrategie.getRabatt());
    }

    @Override
    public String toString() {
        return "Angebot{" +
                "regulaerpreis=" + regulaerpreis +
                ", flugdatum=" + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                ", rabattstrategie=" + rabattstrategie +
                '}';
    }
}
