package Kitty;

public class CountMeow implements Meowable{
    private final Meowable original;
    private int count=0;

    public CountMeow(Meowable original) {
        this.original = original;
    }

    @Override
    public void meow() {
        count++;
        original.meow();
    }

    public int getCount() {
        return count;
    }
}
