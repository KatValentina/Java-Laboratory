import java.util.Scanner;
import java.util.InputMismatchException;

public class Metods {

    //проверка на ввод отрицательных чисел или на неправильные данные
    public static int isPossitive() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print("Введите число: ");
                number = scanner.nextInt();
                if (number<0) {
                    throw new IllegalArgumentException("Отрицательное число!");
                }
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число!");
                scanner.nextLine(); // Очистка буфера
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
