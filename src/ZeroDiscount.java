import java.time.LocalDate;

public class ZeroDiscount extends Rabattstrategie{
    private final double rabatt = 0;

    public ZeroDiscount(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public double getReduzierterPreis(double regulaerPreis) {
        return regulaerPreis * (1-this.rabatt);
    }

    public double getRabatt() {
        return rabatt;
    }
}

