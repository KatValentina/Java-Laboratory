import java.util.Scanner;
import ru.kataeva.metods.Metods;

public class Main {

    // Метод для работы с коробкой
    public static void onBox(Box<Integer> box) {
        if (box.isEmpty()) {
            Integer value = box.takeItem();
            System.out.println("В коробке лежит: " + value);
        } else {
            System.out.println("Коробка пуста");
        }
    }

    //
    public static double findMaxValue(Box<? extends Number>[] boxes) {
        if (boxes == null || boxes.length == 0) {
            throw new IllegalArgumentException("Массив коробок не может быть пустым или null");
        }

        double max=0;
        boolean found = false;

        for (Box<? extends Number> box : boxes) {
            if (box != null && box.isEmpty()) {
                Number value = box.getItem();
                if (value != null) {
                    double doubleValue = value.doubleValue();
                    if (!found) {
                        max = doubleValue;
                        found = true;
                    } else if (doubleValue > max) {
                        max = doubleValue;
                    }
                }
            }
        }

        if (!found) {
            throw new IllegalArgumentException("Не найдено ни одного непустого значения в коробках");
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
                            int x = (int) Metods.isInt();
                            box.putItem(x);
                            System.out.println("В коробке что-то есть? "+box.isEmpty());
                            onBox(box);
                            System.out.println("В коробке что-то есть? "+box.isEmpty());
                            System.out.println(box.toString());

                        } catch (IllegalStateException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case "3": {
                        System.out.println("Сейчас вам предстоит ввести значения, которые хотите сравнить");
                        try {
                            int x = (int) Metods.isInt();
                            Num n1 = new Num(x);
                            int y = (int) Metods.isInt();
                            Num n2 = new Num(y);
                            System.out.println("Если вывелось отрицательное число, то первое число меньше второго." +
                                    "\nЕсли вывелось положительное, то первое число больше второго. " +
                                    "\nЕсли вышло 0, то числа равны");
                            System.out.print("Результат сравнения: "+ n1.compare(n2));

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
                    System.out.println("Первая коробка. ");
                    box1.putItem(Metods.isInt().intValue());

                    System.out.println("Вторая коробка. ");
                    box2.putItem(Metods.isInt().doubleValue());

                    System.out.println("Третья коробка. ");
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
                break;
            }
            default: System.out.println("Нет такого задания");
            break;
        }
    }
}