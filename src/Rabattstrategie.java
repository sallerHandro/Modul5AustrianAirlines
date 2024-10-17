public class Rabattstrategie{

    private final double rabatt;

    public Rabattstrategie(double rabatt) {
        this.rabatt = rabatt;
    }

    public double getReduzierterPreis(double regulaerPreis) {
        return regulaerPreis * (1 - this.rabatt);
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
