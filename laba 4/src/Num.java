public class Num implements Comparable<Num> {
    private int value;

    public int getValue() {
        return value;
    }

    public Num(int n) {
        this.value = n;
    }

    public int compare(Num n) {
        return this.value - n.value;
    }
}
