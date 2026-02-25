import java.util.Scanner;

public class Metod {

    //проверка на число
    public static boolean isInt(String s) {
        if (s != null && !s.isEmpty()) {
            try {
                int number = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число!(или были введены помимо числа пробелы)");
                return false;
            }
        } else {
            System.out.println("Строка пуста (или null)!");
            return false;
        }
    }

    //цикл проверок, пока число не подойдёт
    public static int chekInt() {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
         while (!Metod.isInt(n)) {
             System.out.print("Введите новое значение: ");
             n = scanner.nextLine();
         }
         int num = Integer.parseInt(n);
         return num;
    }

    //проверка на строку
    public static boolean isVoid(String s) {
        if (s==null || s.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    //цикл проверок, пока число не подойдёт
    public static String chekStr() {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        while (!Metod.isVoid(n)) {
            System.out.print("Введите новое значение: ");
            n = scanner.nextLine();
        }
        return n;
    }
}
