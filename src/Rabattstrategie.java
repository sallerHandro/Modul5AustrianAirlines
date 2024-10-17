import java.time.LocalDate;

public abstract class Rabattstrategie{

    private String bezeichnung;

    public Rabattstrategie(String bezeichnung) {
        this.bezeichnung = bezeichnung;

    }

    public abstract double getReduzierterPreis(double regulaerPreis);

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
