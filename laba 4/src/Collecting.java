import ru.kataeva.metods.Metods;

import java.util.Collection;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Collecting {
    public static <T, P extends Collection<T>> P collect(
            List<T> s,
            Supplier<P> collectionFactory,
            Function<List<T>, P> valueMapper) {

        return valueMapper.apply(s);
    }

    //заполнение списка числами
    public static List<Number> inputNumbers(int n) {
        Scanner scanner = new Scanner(System.in);
        List<Number> numbers = new ArrayList<>();
        for (int i=0;i<n;i++){
            Number number = Metods.isInt();
            numbers.add(number);
        }
        return numbers;
    }

    public static void listNum(List<Number> digit) {
        if(digit==null) {
            throw new IllegalStateException("Ссылка на массив отсутствует");
        } else {
            List<Number> positiveNumbers = collect(
                    digit,
                    ArrayList::new,
                    list -> list.stream()
                            .filter(i -> i.doubleValue() > 0)
                            .collect(Collectors.toCollection(ArrayList::new))
            );

            List<Number> negativeNumbers = collect(
                    digit,
                    ArrayList::new,
                    list -> list.stream()
                            .filter(i -> i.doubleValue() < 0)
                            .collect(Collectors.toCollection(ArrayList::new))
            );

            List<Number> zeros = collect(
                    digit,
                    ArrayList::new,
                    list -> list.stream()
                            .filter(i -> i.doubleValue() == 0)
                            .collect(Collectors.toCollection(ArrayList::new))
            );

            System.out.println("\nРезультат разделения:");
            System.out.println("Исходный список: ");
            Metods.printArr(digit);
            System.out.print("Положительные числа: ");
            Metods.printArr(positiveNumbers);
            System.out.print("Отрицательные числа: ");
            Metods.printArr(negativeNumbers);
            System.out.print("Нули: ");
            Metods.printArr(zeros);
        }
    }

    //заполнение списка строками
    public static List<String> inputStr(int n) {
        Scanner scanner = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        for (int i=0;i<n;i++){
            System.out.print("Строка: ");
            String s = scanner.nextLine();
            while (Metods.isVoid(s)) {
                System.out.print("Строка пуста, введите заново: ");
                s = scanner.nextLine();
            }
            str.add(s);
        }
        return str;
    }

    public static void listStrLength(List<String> s) {

        if(s==null) {
            throw new IllegalStateException("Ссылка на массив отсутствует");
        } else {
            Map<Integer, List<String>> groupedByLength = s.stream()
                    .collect(Collectors.groupingBy(String::length));

            System.out.println("\nРезультат группировки:");
            System.out.println("Исходный список: " + s);
            groupedByLength.forEach((length, strList) ->
                    System.out.println("Строки длины " + length + ": " + strList));
        }
    }

    public static void listStr(List<String> s) {
        if (s == null) {
            throw new IllegalStateException("Ссылка на массив отсутствует");
        } else {
            Set<String> uniqueStrings = collect(
                    s,
                    LinkedHashSet::new,
                    list -> list.stream()
                            .collect(Collectors.toCollection(LinkedHashSet::new))
            );

            System.out.println("\nРезультат:");
            System.out.print("Исходный список: " + s);
            System.out.println("\nУникальные строки: " + uniqueStrings);
        }
    }
}
