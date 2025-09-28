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
                        System.out.println("Сейчас будет создано 3 человека." +
                                " Введите данные.");
                        Name person1 = new Name();
                        Name person2 = new Name();
                        Name person3 = new Name();

                        System.out.println("Имя человека должно быть не менее 2 знаков, не содержать знаки препинания,\nтабуляции, пробелы, " +
                                "а также цифры. Но может содержать дефис. Принимается имя, написанное только кириллицей.");
                        person1.createName();
                        person2.createName();
                        person3.createName();

                        System.out.println("Созданные люди: ");
                        System.out.println(person1.toString());
                        System.out.println(person2.toString());
                        System.out.println(person3.toString());
                        break;
                    }
                    default: System.out.println("Нет такого подзадания");
                    break;
                }
            }
            case 2: {
                Department depIT = new Department("IT");
                System.out.println("Сейчас будет создано 3 человека");
                Worker person1 = new Worker("Петров",depIT);
                Worker person2 = new Worker("Козлов",depIT);
                Worker person3 = new Worker("Сидоров",depIT);

                depIT.setChief(person2);

                System.out.println("Созданные люди: ");
                System.out.println(person1.toString());
                System.out.println(person2.toString());
                System.out.println(person3.toString());
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