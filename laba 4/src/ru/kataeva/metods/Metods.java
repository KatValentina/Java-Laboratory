package ru.kataeva.metods;

import java.util.*;
import java.util.Scanner;

public class Metods {
    //проверка на ввод неправильные данные в переменную числовую
    public static Number isInt() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите число: ");
                String s = scanner.nextLine();

                if (s.isEmpty()) {
                    throw new IllegalStateException("Вы оставили ввод пустым.");
                }

                if (s.trim().length() != s.length()) {
                    throw new IllegalStateException("В введённых данных есть пробелы.");
                }

                try {
                    return Integer.parseInt(s);
                } catch (NumberFormatException e1) {
                    try {
                        return Double.parseDouble(s);
                    } catch (NumberFormatException e2) {
                        System.out.println("Введённые данные не число.");
                    }
                }

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

    //проверка на допустимое имя в справочнике
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

    // Проход по списку
    public static <T> void printArr(List<T> s) {
        for (T item : s) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
