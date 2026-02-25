package Kitty;

public class Funs {
    public static void meowsCare(Meowable ...arr) {
        for (Meowable m : arr) {
            m.meow();
        }
    }
}
