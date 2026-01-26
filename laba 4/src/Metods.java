import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metods {

    //проверка на ввод целого числа
    public static boolean isInt(String s) {
        if ( (s==null) ||s.isEmpty() ) {
            System.out.println("Строка пуста (или null)!");
            return false;
        } else {
            try {
                int number = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число!(или были введены помимо числа пробелы)");
                return false;
            }
        }
    }

    //проверка на число
    public static boolean isNumber(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("Строка пуста (или null)!");
            return false;
        }
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!(или были введены помимо числа пробелы)");
            return false;
        }
    }

    //проверка на строку
    public static boolean isVoid(String s) {
        if (s==null || s.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    //заполнение списка строками
    public static List<String> addEl( int n) {
        Scanner scanner = new Scanner(System.in);
        List<String> s = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку: ");
            String el = scanner.nextLine();

            while (!Metods.isVoid(el)) {
                System.out.print("Введите новое значение: ");
                el = scanner.nextLine();
            }

            s.add(el);
        }
        return s;
    }

    //заполнение списка числами
    public static List<Integer> addEl2( int n) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> s = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            String el = scanner.nextLine();

            while (!Metods.isInt(el)) {
                System.out.print("Введите новое значение: ");
                el = scanner.nextLine();
            }
            int m = Integer.parseInt(el);

            s.add(m);
        }
        return s;
    }

    //заполнение массивов
    public static int[] fullMas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Заполним массив данными.Введите размер: ");
        String m = scanner.nextLine();
        String k;
        while (!Metods.isInt(m)) {
            System.out.println("Некорректное значение. Введите другое");
            m = scanner.nextLine();
        }
        int count = Integer.parseInt(m);
        if(count< 0) {
            throw  new IllegalStateException("Размер отрицателен");
        }
        int[] n = new int [count];
        for (int i=0;i<count;i++) {
            System.out.print("Введите значение: ");
            k = scanner.nextLine();
            while(!Metods.isInt(k)) {
                System.out.println("Вы ввели не число. Введите новое: ");
                k=scanner.nextLine();
            }
            n[i] = Integer.parseInt(k);
        }
        return n;
    }



}
