import Filters.Page2;
import Functions.Page1;

import java.util.*;

public class Main {

    //Метод для коробки (подкидываем коробку. Где верх?)
    public static <T> void dropBox(Box<T> box) {
        Random random = new Random();
        int rand = random.nextInt(2);
        if (rand == 1) {
            System.out.println("Коробка вверх дном. Вы не знаете что внутри");
        } else {
            T item = box.takeObject();
            System.out.print("О! Коробка к верху крышкой. Вы " +
                    "достаёте предмет: "+item);

        }
    }

    //метод для работы со списком коробок
    public static double maxValue(Box<? extends Number>[] boxes) {
        boolean found = false;
        double max = 0.0;

        for (Box<? extends Number> s : boxes) {
            if (s != null && !s.isEmpty()) {
                double value = s.getObject().doubleValue();
                if (!found) {
                    max = value;
                    found = true;
                } else if (value > max) {
                    max = value;
                }
            }
        }

        if (!found) {
            throw new IllegalStateException("Не найдено ни одной непустой коробки");
        }
        return max;
    }

    public static void main(String[] args) {

        String value;
        System.out.print("Номер блока: ");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        switch (value) {
            case "1":
                String val;
                System.out.print("Введите номер задания: ");
                val = scanner.nextLine();
                switch (val) {
                    case "1":
                        Box<Integer> box = new Box<Integer>();
                        System.out.println("Сейчас вам предстоит положить число в коробку.");
                        try {
                            System.out.print("Введите целочисленное значение: ");
                            String n = scanner.nextLine();
                            while (!Metods.isInt(n)) {
                                System.out.print("Введите новое целочисленное значение: ");
                                n = scanner.nextLine();
                            }
                            int number = Integer.parseInt(n);
                            box.putObject(number);
                            dropBox(box);
                            int item = box.takeObject();
                            System.out.print("В коробке лежало: "+ item);

                        }catch (IllegalStateException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "3":
                        System.out.println("Сравним два целочисленных значения. ");
                        try {
                            System.out.print("Введите 1 целочисленное значение: ");
                            String n = scanner.nextLine();
                            while (!Metods.isInt(n)) {
                                System.out.print("Введите новое целочисленное значение: ");
                                n = scanner.nextLine();
                            }
                            Num num1 = new Num( Integer.parseInt(n) );
                            System.out.print("Введите 2 целочисленное значение: ");
                            n = scanner.nextLine();
                            while (!Metods.isInt(n)) {
                                System.out.print("Введите новое целочисленное значение: ");
                                n = scanner.nextLine();
                            }
                            Num num2 = new Num( Integer.parseInt(n) );
                            if (num1==null || num2==null) {
                                throw new IllegalStateException("Один или оба объекта null");
                            }

                            int result = num1.compare(num2);
                            System.out.println("Если вывелось отрицательное число, то первое число меньше второго.");
                            System.out.println("Если вывелось положительное, то первое число больше второго.");
                            System.out.println("Если вышло 0, то числа равны");
                            System.out.println("Результат сравнения: "+ result);
                        }catch (IllegalStateException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Нет такого задания");
                        break;

                }
                break;
            case "2":
                System.out.println("Создадим 3 разные коробки.");
                try {
                    //1 коробка
                    Box<Integer> box1 = new Box<Integer>();
                    System.out.print("Создадим 1 коробку.Введите целочисленное значение: ");
                    String n = scanner.nextLine();
                    while (!Metods.isInt(n)) {
                        System.out.print("Введите новое целочисленное значение: ");
                        n = scanner.nextLine();
                    }
                    int number = Integer.parseInt(n);
                    box1.putObject(number);

                    //2 коробка
                    Box<Float> box2 = new Box<Float>();
                    System.out.print("Создадим 2 коробку.Введите значение типа float: ");
                    n = scanner.nextLine();
                    while (!Metods.isNumber(n)) {
                        System.out.print("Введите новое значение: ");
                        n = scanner.nextLine();
                    }
                    float num2 = Float.parseFloat(n);
                    box2.putObject(num2);

                    //3 коробка
                    Box<Double> box3 = new Box<Double>();
                    System.out.print("Создадим 2 коробку.Введите значение типа double: ");
                    n = scanner.nextLine();
                    while (!Metods.isNumber(n)) {
                        System.out.print("Введите новое значение: ");
                        n = scanner.nextLine();
                    }
                    Double num3 = Double.parseDouble(n);
                    box3.putObject(num3);

                    Box<? extends Number>[] boxes = new Box[]{box1, box2, box3};
                    System.out.println("Самое большое число в коробках: "+maxValue(boxes));

                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "3":
                System.out.print("Введите номер задания: ");
                val = scanner.nextLine();
                switch (val) {
                    case "1":
                        try {
                            System.out.println("Первая часть задания. Работа со строками и их длинами.");
                            String n;
                            System.out.print("Сколько значений хотите ввести: ");
                            n = scanner.nextLine();
                            while (!Metods.isInt(n)) {
                                System.out.print("Введите новое значение: ");
                                n = scanner.nextLine();
                            }
                            int count = Integer.parseInt(n);
                            if(count<0) {
                                throw new IllegalStateException("Количество элементов в списке отрицательно");
                            }
                            List<String> z= Metods.addEl(count);
                            List<Integer> lenght = Page1.transform(z,s1 -> s1.length());
                            System.out.println("Длины строк: " + lenght);


                            System.out.println("Вторая часть задания. Работа с числами и их положительностью" +
                                    " и отрицательностью");
                            System.out.print("Сколько значений хотите ввести: ");
                            n = scanner.nextLine();
                            while (!Metods.isInt(n)) {
                                System.out.print("Введите новое значение: ");
                                n = scanner.nextLine();
                            }
                            count = Integer.parseInt(n);
                            if(count<0) {
                                throw new IllegalStateException("Количество элементов в списке отрицательно");
                            }
                            List<Integer> s1 = Metods.addEl2(count);
                            List<Integer> r = Page1.transform(s1,i -> i < 0 ? -i : i);
                            System.out.println("Обратные значения: " + r);


                            System.out.print("Третья часть задания. Работа с массивами и их максимальными значениями");
                            System.out.println("\nСоздадим 3 массива");
                            int[] m1 = Metods.fullMas();
                            int[] m2 = Metods.fullMas();
                            int[] m3 = Metods.fullMas();
                            List<int[]> arrays = Arrays.asList( m1, m2, m3 );
                            List<Integer> maxValues = Page1.transform(arrays, arr -> {
                                if (arr.length == 0) {
                                    return null;
                                }

                                int max = arr[0];
                                for (int x : arr) if (x > max) max = x;
                                return max;
                            });
                            System.out.println("Максимальные элементы: " + maxValues);

                        }catch (IllegalStateException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "2":
                        try {
                            System.out.println("Первая часть задания. Фильтрация строк, длина которых меньше 3.");
                            String n;
                            System.out.print("Сколько значений хотите ввести: ");
                            n = scanner.nextLine();
                            while (!Metods.isInt(n)) {
                                System.out.print("Введите новое значение: ");
                                n = scanner.nextLine();
                            }
                            int count = Integer.parseInt(n);
                            if(count<0) {
                                throw new IllegalStateException("Количество элементов в списке отрицательно");
                            }
                            List<String> z= Metods.addEl(count);
                            List<String> filtered = Page2.filter(z, s -> s.length() >= 3);
                            System.out.println("Итог: " + filtered);


                            System.out.println("Вторая часть задания. Работа только с отрицательными числами");
                            System.out.print("Сколько значений хотите ввести: ");
                            n = scanner.nextLine();
                            while (!Metods.isInt(n)) {
                                System.out.print("Введите новое значение: ");
                                n = scanner.nextLine();
                            }
                            count = Integer.parseInt(n);
                            if(count<0) {
                                throw new IllegalStateException("Количество элементов в списке отрицательно");
                            }
                            List<Integer> s1 = Metods.addEl2(count);
                            List<Integer> r= Page2.filter(s1, i -> i < 0);
                            System.out.println("Только отрицательные: " + r);


                            System.out.print("Третья часть задания. Работа с массивами, в которых все значения отрицательные");
                            System.out.println("\nСоздадим 3 массива");
                            int[] m1 = Metods.fullMas();
                            int[] m2 = Metods.fullMas();
                            int[] m3 = Metods.fullMas();
                            List<int[]> arrays = Arrays.asList( m1, m2, m3 );
                            List<int[]> noPositive = Page2.filter(arrays, arr -> {
                                for (int x : arr) {
                                    if (x > 0 || x==0) return false;
                                }
                                return true;
                            });

                            System.out.println("Подходящие массивы:");
                            for (int[] a : noPositive) {
                                System.out.println(Arrays.toString(a));
                            }

                        }catch (IllegalStateException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Нет такого задания");
                        break;
                }
                break;
            default:
                System.out.println("Нет такого блока");
                break;

        }

    }
}