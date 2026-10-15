import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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

    //проверка на ввод строки
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

    //удаление определённого элемента из списка
    public static <T> void removeE(List<T> list, T element) {
        list.removeIf(x -> x.equals(element));
    }
}
