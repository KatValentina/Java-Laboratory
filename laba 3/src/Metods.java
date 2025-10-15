import java.util.Scanner;

public class Metods {

    //проверка на ввод неправильные данные
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
}
