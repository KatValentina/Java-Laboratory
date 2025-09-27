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
                    case 2: {
                        System.out.println("Сейчас будет создано 3 человека." +
                                " Введите данные.");
                        Human person1 = new Human();
                        Human person2 = new Human();
                        Human person3 = new Human();

                        System.out.println("Имя человека должно быть не менее 2 знаков, не содержать знаки препинания,\nтабуляции, пробелы, " +
                                "а также цифры. Но может содержать дефис. Принимается имя, написанное только кириллицей.");

                        person1.createHuman();
                        person2.createHuman();
                        person3.createHuman();

                        System.out.println("Созданные люди: ");
                        System.out.println(person1.toString());
                        System.out.println(person2.toString());
                        System.out.println(person3.toString());
                        break;
                    }
                    case 3: {

                        break;
                    }
                }
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                break;
            }
            default: System.out.println("Нет такого задания");
            break;
        }
    }
}