package Fraction;

public class CachedFrac  extends Fraction{
    private Double cachedV = null;

    public CachedFrac(int numer, int denom) {
        super(numer, denom);
    }

    @Override
    public void setNumer(int numerator) {
        super.setNumer(numerator);
        cachedV = null;
    }

    @Override
    public void setDenom(int denom) {
        super.setDenom(denom);
        cachedV = null;
    }

    @Override
    public double getValue() {
        if (cachedV == null) {
            cachedV = super.getValue();
        }
        return cachedV;
    }
}
