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
        rabattstrategieWaehlen();
    }

    private void rabattstrategieWaehlen(){
        if (flugdatum.getMonth().getValue() == 1 || flugdatum.getMonth().getValue() == 4 || flugdatum.getMonth().getValue() == 10){
            rabattstrategie = new MaxiDiscount("Maximaler Rabatt");
        } else if (flugdatum.getMonth().getValue() == 2 || flugdatum.getMonth().getValue() == 3) {
            rabattstrategie = new MidiDiscount("Mittlerer Rabatt");
        } else {
            rabattstrategie = new ZeroDiscount("Kein Rabatt");
        }
    }

    public double getReduzierterPreis(){
        return rabattstrategie.getReduzierterPreis(this.regulaerpreis);
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

    public Rabattstrategie getRabattstrategie() {
        return rabattstrategie;
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
