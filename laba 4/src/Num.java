public class Num implements Comparable<Num>{
    private int value;

    public int setValue() {
        return value;
    }

    public Num(int n) {
        this.value = n;
    }

    public int compare (Num n) {
       return this.value - n.value;
    }

    @Override
    public String toString() {
        return "Число: " + this.value;
    }
}
