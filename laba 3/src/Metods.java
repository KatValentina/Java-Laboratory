import java.util.Scanner;

public class Metods {

    //проверка на ввод неправильные данные в переменную типа int
    public static int isInt() {
        Scanner scanner = new Scanner(System.in);
        int number;
        String s;
        while (true) {
            try {
                System.out.print("Введите число: ");
                s = scanner.nextLine();
                if (s.isEmpty()) {
                    throw new IllegalStateException("Вы оставили ввод пустым.");
                }
                number = Integer.parseInt(s);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число!(или были введены помимо числа пробелы)");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //проверка на допустимое имя
    public static boolean correctName(String s) {
        if (s==null) {
            return true;
        }
        if (s.isEmpty()) {
            return true;
        }

        if (s.charAt(0)=='-' || s.charAt(s.length()-1)=='-') {
            return false;
        } else {
            for (char c : s.toCharArray()) {
                if (!((c>='А'&& c<='я')||(c=='-'))) {
                    return false;
                }
            }
            return true;
        }
    }

    //ввод имени
    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean c;
        c = Metods.correctName(name);

        while (!c) {
            System.out.print("Неверно введённые данные. Введите другие: ");
            name = scanner.nextLine();
            c = Metods.correctName(name);
        }
        return name;
    }

    //проверка на null и пустую строку
    public static boolean isVoid(String s) {
        if ( s == null || s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    //проверка на допустимое имя в справочник
    public static boolean correctPeople(String s) {
        if (s==null || s.isEmpty() || s.contains(" ")) {
            return false;
        }

        if (s.charAt(0)=='-' || s.charAt(s.length()-1)=='-' || s.length()<2) {
            return false;
        } else {
            for (char c : s.toCharArray()) {
                if (!((c>='А'&& c<='я')||(c=='-'))) {
                    return false;
                }
            }
            return true;
        }
    }

    //проход по строковому массиву
    public static void printArr(String[]s) {
        for (int i=0;i<s.length;i++) {
            System.out.println(s[i]);
        }
    }
}
