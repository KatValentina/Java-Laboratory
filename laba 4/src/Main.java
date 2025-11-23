import java.util.List;
import java.util.*;
import java.util.function.*;
import java.util.Scanner;
import java.util.stream.Collectors;

import ru.kataeva.metods.Metods;

public class Main {

    // Метод для работы с коробкой
    public static void onBox(Box<Integer> box) {
        if (box.isEmpty()) {
            Integer value = box.takeItem();
            System.out.println("В коробке лежит: " + value);
        } else {
            throw new IllegalStateException("Коробка пуста!");
        }
    }

    //метод для работы с массивом коробок
    public static double findMaxValue(Box<? extends Number>[] boxes) {
        if (boxes == null || boxes.length == 0) {
            throw new IllegalArgumentException("Массив коробок не может быть пустым или null");
        }

        double max=0;
        boolean found = false;

        for (Box<? extends Number> box : boxes) {
            if (box != null && box.isEmpty()) {
                Number value = box.getItem();
                double doubleValue = value.doubleValue();
                if (!found) {
                    max = doubleValue;
                    found = true;
                } else if (doubleValue > max) {
                    max = doubleValue;
                }
            }
        }

        if (!found) {
            throw new IllegalArgumentException("Не найдено ни одной не пустой коробки");
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number;
        System.out.print("Введите номер задания: ");
        number = scanner.nextLine();
        switch (number) {
            case "1": {
                String num;
                System.out.print("Номер подзадания: ");
                num = scanner.nextLine();
                switch (num) {
                    case "1": {
                        Box<Integer> box = new Box<Integer>();
                        System.out.println("Вам предстоит ввести число,которое вы хотите положить в коробку");
                        try {
                            int x = Metods.isInt().intValue();
                            box.putItem(x);
                            System.out.println("В коробке что-то есть? " + box.isEmpty());
                            onBox(box);
                            System.out.println("В коробке что-то есть? " + box.isEmpty());
                            System.out.println(box.toString());

                        } catch (IllegalStateException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case "3": {
                        System.out.println("Сейчас вам предстоит ввести значения, которые хотите сравнить");
                        try {
                            int x = Metods.isInt().intValue();
                            Num n1 = new Num(x);
                            int y = Metods.isInt().intValue();
                            Num n2 = new Num(y);
                            if (n1==null || n2==null) {
                                throw new IllegalStateException("Один или оба объекта null");
                            }
                            System.out.println("Если вывелось отрицательное число, то первое число меньше второго." +
                                    "\nЕсли вывелось положительное, то первое число больше второго. " +
                                    "\nЕсли вышло 0, то числа равны");
                            System.out.print("Результат сравнения: " + n1.compare(n2));

                        } catch (IllegalStateException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    default: System.out.println("Нет такого подзадания");
                    break;
                }
                break;
            }
            case "2": {
                Box<Integer> box1 = new Box<Integer>();
                Box<Double> box2 = new Box<Double>();
                Box<Float> box3 = new Box<Float>();
                System.out.println("Вам предстоит создать 3 коробки.");
                try {
                    System.out.println("Первая коробка cо значением int(если было введено вещественное число," +
                            "то оно будет преобразовано в целое.");
                    box1.putItem(Metods.isInt().intValue());

                    System.out.println("Вторая коробка со значением double.");
                    box2.putItem(Metods.isInt().doubleValue());

                    System.out.println("Третья коробка со значением float. ");
                    box3.putItem(Metods.isInt().floatValue());

                    Box<? extends Number>[] boxes = new Box[]{box1, box2, box3};
                    double max = findMaxValue(boxes);
                    System.out.println("Максимальное значение: " + max);

                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            case "3": {
                String num;
                System.out.print("Номер подзадания: ");
                num = scanner.nextLine();
                switch (num) {
                    case "1": {
                        int n;
                        System.out.println("\n=== МЕНЮ ===");
                        System.out.println("1.Преобразовать строки в список чисел,где каждое число соответствует длине каждой строки.");
                        System.out.println("2.Преобразовать список чисел,чтобы все отрицательные числа стали положительными, " +
                                "а положительные остались без изменений");
                        System.out.println("3.Передайте в метод список состоящий из массивов целых чисел, а получите список в\n" +
                                "котором будут только максимальные значения каждого из исходных массивов");
                        System.out.print("Выберите действие: ");
                        String sh = scanner.nextLine();
                        try {
                            switch (sh) {
                                case "1": {
                                    System.out.print("Сколько строк будет в списке.");
                                    System.out.println("При вводе вещественного числа в поле с количеством " +
                                            "значений в списке, оно будет преобразовано в значение типа int");
                                    n = Metods.isInt().intValue();
                                    if (n < 0) {
                                        throw new IllegalArgumentException("Количество значений в списке не может быть отрицательно");
                                    } else {
                                        System.out.println("\nСейчас вам предстоит заполнить список значениями");
                                        List<String> lines = Collecting.inputStr(n);
                                        if (lines.isEmpty() || lines==null) {
                                            System.out.println("Список чисел пуст!");
                                        } else {
                                            List<Integer> stringLengths = Functi.transformList(lines, String::length);

                                            System.out.println("Исходный список: " + lines);
                                            System.out.println("Длины строк: " + stringLengths);
                                        }
                                    }
                                    break;
                                }
                                case "2": {
                                    System.out.print("Сколько чисел будет в списке.");
                                    System.out.println("При вводе вещественного числа в поле с количеством " +
                                            "значений в списке, оно будет преобразовано в значение типа int");
                                    n = Metods.isInt().intValue();
                                    if (n < 0) {
                                        throw new IllegalArgumentException("Количество значений в списке не может быть отрицательно");
                                    } else {
                                        System.out.println("\nСейчас вам предстоит заполнить список значениями");
                                        List<Number> digit = Collecting.inputNumbers(n);
                                        if (digit.isEmpty() || digit==null) {
                                            System.out.println("Список чисел пуст!");
                                        } else {
                                            List<Number> result = Functi.transformList(digit, i -> {
                                                double value = i.doubleValue();
                                                if (value < 0) {

                                                    return Math.abs(value);
                                                }
                                                return i;
                                            });
                                            System.out.print("Исходный список: " + digit);
                                            System.out.print("\nРезультат: " + result);
                                        }
                                    }
                                    break;
                                }
                                case "3": {
                                    System.out.println("Сейчас будут созданы 2 массива");
                                    System.out.print("Сколько чисел будет в списках.");
                                    System.out.println("При вводе вещественного числа в поле с количеством " +
                                            "значений в списке, оно будет преобразовано в значение типа int");
                                    n = Metods.isInt().intValue();
                                    int m = Metods.isInt().intValue();
                                    if (n < 0 || m < 0 ) {
                                        throw new IllegalArgumentException("Количество значений в списке не может быть отрицательно");
                                    } else {

                                        System.out.println("Первый массив.");
                                        Number[] s1 = new Number[n];
                                        for (int i=0;i<n;i++){
                                            s1[i]=Metods.isInt();
                                        }

                                        System.out.println("Второй массив.");
                                        Number[] s2 = new Number[m];
                                        for (int i=0;i<m;i++){
                                            s2[i]=Metods.isInt();
                                        }
                                        if (s1 == null || s1.length == 0 || s2 == null || s2.length == 0) {
                                            System.out.println("Один или оба массива пусты или массив null");
                                        } else {
                                            List<Number[]> arrays = Arrays.asList(
                                                    s1,
                                                    s2
                                            );

                                            List<Number> maxValues = Functi.transformList(arrays, arr -> {
                                                if (arr == null || arr.length == 0) {
                                                    return null;
                                                }
                                                return Arrays.stream(arr)
                                                        .max(Comparator.comparingDouble(Number::doubleValue))
                                                        .orElse(null);
                                            });

                                            System.out.println("\nМаксимальные значения массивов:");
                                            System.out.println("Исходные массивы: " +
                                                    arrays.stream()
                                                            .map(arr -> Arrays.toString(arr))
                                                            .collect(Collectors.toList()));
                                            System.out.println("Максимумы: " + maxValues);
                                        }
                                    }
                                    break;
                                }
                                default: System.out.println("Нет такого функционала");
                                    break;
                            }
                        } catch(IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        } catch(IllegalStateException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case "2": {
                        break;
                    }
                    case "3": {
                        break;
                    }
                    case "4": {
                        int n;
                        System.out.println("\n=== МЕНЮ ===");
                        System.out.println("1. Разделить числа на положительные и отрицательные");
                        System.out.println("2. Сгруппировать строки по длине");
                        System.out.println("3. Получить уникальные строки");
                        System.out.print("Выберите действие: ");
                        String sh = scanner.nextLine();
                        try {
                            switch (sh) {
                                case "1": {
                                    System.out.print("Сколько чисел будет в списке.");
                                    System.out.println("При вводе вещественного числа в поле с количеством " +
                                            "значений в списке, оно будет преобразовано в значение типа int");
                                    n = Metods.isInt().intValue();
                                    if (n < 0) {
                                        throw new IllegalArgumentException("Количество значений в списке не может быть отрицательно");
                                    } else {
                                        System.out.println("\nСейчас вам предстоит заполнить список значениями");
                                        List<Number> digit = Collecting.inputNumbers(n);
                                        if (digit.isEmpty()) {
                                            System.out.println("Список чисел пуст!");
                                        } else {
                                            Collecting.listNum(digit);
                                        }
                                    }
                                    break;
                                }
                                case "2": {
                                    System.out.print("Сколько строк будет в списке.");
                                    System.out.println("При вводе вещественного числа в поле с количеством " +
                                            "значений в списке, оно будет преобразовано в значение типа int");
                                    n = Metods.isInt().intValue();
                                    if (n < 0) {
                                        throw new IllegalArgumentException("Количество значений в списке не может быть отрицательно");
                                    } else {
                                        System.out.println("\nСейчас вам предстоит заполнить список значениями");
                                        List<String> lines = Collecting.inputStr(n);
                                        if (lines.isEmpty()) {
                                            System.out.println("Список чисел пуст!");
                                        } else {
                                            Collecting.listStrLength(lines);
                                        }
                                    }
                                    break;
                                }
                                case "3": {
                                    System.out.print("Сколько строк будет в списке.");
                                    System.out.println("При вводе вещественного числа в поле с количеством " +
                                            "значений в списке, оно будет преобразовано в значение типа int");
                                    n = Metods.isInt().intValue();
                                    if (n < 0) {
                                        throw new IllegalArgumentException("Количество значений в списке не может быть отрицательно");
                                    } else {
                                        System.out.println("\nСейчас вам предстоит заполнить список значениями");
                                        List<String> lines = Collecting.inputStr(n);
                                        if (lines.isEmpty()) {
                                            System.out.println("Список чисел пуст!");
                                        } else {
                                            Collecting.listStr(lines);
                                        }
                                    }
                                    break;
                                }
                                default: System.out.println("Нет такого функционала");
                                break;
                            }
                        } catch(IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        } catch(IllegalStateException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    default: System.out.println("Нет такого подзадания");
                    break;
                }
                break;
            }
            default: System.out.println("Нет такого задания");
            break;
        }
    }
}