import java.time.LocalDate;

public abstract class Rabattstrategie extends Angebot{

    private String bezeichnung;

    public Rabattstrategie(double regulaerpreis, LocalDate flugdatum, String flugnummer) {
        super(regulaerpreis, flugdatum, flugnummer);
    }

    public abstract double getReduzierterPreis(double regulaerPreis);

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
