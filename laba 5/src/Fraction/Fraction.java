package Fraction;

import java.util.Objects;

public class Fraction implements FracInter {
    private int numer;
    private int denom;

    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    @Override
    public double getValue(){
        return (double) this.numer/this.denom;
    }

    @Override
    public void setNumer(int numer){
        this.numer = numer;
    }

    @Override
    public void setDenom(int denom) {
        if (denom == 0) {
            throw new IllegalStateException("Знаменатель не может равняться 0");
        }

        if (denom < 0) {
            this.numer = -this.numer;
            denom = -denom;
        }

        this.denom = denom;
    }


    public Fraction(int numer,int denom) {
        if (denom ==0 ) {
            throw new IllegalStateException("\nЗнаменатель не должен быть равен 0");
        } else {

            if (denom < 0) {
                numer = -numer;
                denom = -denom;
            }
            this.denom=denom;
            this.numer = numer;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fraction)) {
            return false;
        }
        Fraction other = (Fraction) obj;
        if (other.numer==numer && other.denom==denom) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return numer+"/"+denom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numer, denom);
    }
}
