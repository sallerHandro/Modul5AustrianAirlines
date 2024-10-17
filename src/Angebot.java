import java.time.LocalDate;

public class Angebot {
    private double regulaerpreis;
    private LocalDate flugdatum;
    private String flugnummer;

    public Angebot(double regulaerpreis, LocalDate flugdatum, String flugnummer) {
        this.regulaerpreis = regulaerpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
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

    @Override
    public String toString() {
        return "Angebot{" +
                "regulaerpreis=" + regulaerpreis +
                ", flugdatum=" + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                '}';
    }
}
