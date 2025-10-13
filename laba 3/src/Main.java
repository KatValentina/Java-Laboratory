import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите номер задания: ");
        number = scanner.nextInt();
        switch (number){
            case 1: {
                int num;
                System.out.print("Номер подзадания: ");
                num = scanner.nextInt();
                switch (num) {
                    case 5: {
                        break;
                    }
                    case 7: {
                        break;
                    }
                    default: System.out.println("Нет такого подзадания");
                    break;
                }
                break;
            }
            case 2: {
                break;
            }
            default: System.out.println("Нет такого задания");
            break;

        }
    }
}