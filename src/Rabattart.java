public enum Rabattart {
    ZERO(0),
    MIDI(0.15),
    MAXI(0.3);

    private final double rabatt;

    Rabattart(double rabatt) {
        this.rabatt = rabatt;
    }

    public double getRabatt() {
        return rabatt;
    }
}
