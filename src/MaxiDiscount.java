import java.time.LocalDate;

public class MaxiDiscount extends Rabattstrategie{
    private final double rabatt = 0.3;

    public MaxiDiscount(String bezeichnung){
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
