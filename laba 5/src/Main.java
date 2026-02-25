import Fraction.CachedFrac;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Номер задания: ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "1":
                int n1,n2,d1,d2;
                System.out.println("Сейчас вам предстоит создать 2 дроби\n");
                System.out.println("Создадим 1 дробь");
                System.out.print("Числитель: ");
                n1 = Metod.chekInt();
                System.out.print("Знаменатель: ");
                d1 = Metod.chekInt();
                CachedFrac f1 = new CachedFrac(n1, d1);
                System.out.print("Дробь: "+f1.toString());

                System.out.println("\nСоздадим 2 дробь");
                System.out.print("Числитель: ");
                n2 = Metod.chekInt();
                System.out.print("Знаменатель: ");
                d2 = Metod.chekInt();
                CachedFrac f2 = new CachedFrac(n2, d2);
                System.out.print("Дробь: "+f2.toString());

                System.out.println("\nОдинаковы ли дроби: "+ f1.equals(f2));
                System.out.println("Вещественное значение 1 дроби: "+f1.getValue());
                System.out.print("Вещественное значение 1 дроби: "+f1.getValue());

                System.out.print("Вещественное значение 2 дроби: "+f2.getValue());
                System.out.print("\nНовый числитель 1 дроби: ");
                n1 = Metod.chekInt();
                f1.setNumer(n1);
                System.out.println("1 дробь: "+f1.toString());
                System.out.print("Вещественное значение 1 дроби: "+f1.getValue());


                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println("Нет задания");
        }
    }
}