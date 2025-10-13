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
                        int n;
                        System.out.print("Сколько человек вы хотите создать: ");
                        n = scanner.nextInt();
                        while (n<=0) {
                            System.out.println("Не возможно создать столько человек, введите другое число: ");
                            n= scanner.nextInt();
                        }
                        Metods t = new Metods();
                        Human [] arr = t.Add(n);

                        System.out.println("Созданные люди: ");
                        for (Human j : arr) {
                            System.out.println(j.toString());
                        }
                        break;
                    }
                    case 3: {
                        int n;
                        System.out.print("Сколько человек вы хотите создать: ");
                        n = scanner.nextInt();
                        while (n<=0) {
                            System.out.println("Не возможно создать столько человек, введите другое число: ");
                            n= scanner.nextInt();
                        }
                        Metods t = new Metods();
                        Name [] arr = t.AddArr(n);

                        System.out.println("Созданные люди: ");
                        for (Name j : arr) {
                            System.out.println(j.toString());
                        }
                        break;
                    }
                    default: System.out.println("Нет такого подзадания");
                    break;
                }
                break;
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
                Department depIT = new Department("IT");
                Department depHR = new Department("HR");
                System.out.println("Сейчас будет создано 5 человек");
                Worker person1 = new Worker("Петров",depIT);
                Worker person2 = new Worker("Козлов",depIT);
                Worker person3 = new Worker("Сидоров",depIT);
                Worker person4 = new Worker("Терещенко",depHR);
                Worker person5 = new Worker("Волегова",depHR);

                depIT.setChief(person2);

                System.out.println("Созданные люди: ");
                System.out.println(person1.toString());
                System.out.println(person2.toString());
                System.out.println(person3.toString());
                System.out.println(person4.toString());
                System.out.println(person5.toString());

                System.out.println("Все сотрудники IT отдела (по Петрову): ");
                Worker[] allIt = person1.getAll();
                for (int i = 0; i < allIt.length; i++) {
                    System.out.println((i + 1) + ". " + allIt[i].getName());
                }
                System.out.println("Все сотрудники HR отдела (по Волеговой): ");
                Worker[] allHR = person5.getAll();
                for (int i = 0; i < allHR.length; i++) {
                    System.out.println((i + 1) + ". " + allHR[i].getName());
                }
                break;
            }
            case 4: {
                int n;
                System.out.print("Сколько человек вы хотите создать: ");
                n = scanner.nextInt();
                while (n<=0) {
                    System.out.println("Не возможно создать столько человек, введите другое число: ");
                    n= scanner.nextInt();
                }
                Metods t = new Metods();
                Name [] arr = t.AddArr(n);

                System.out.println("Созданные люди: ");
                for (Name j : arr) {
                    System.out.println(j.toString());
                }
                break;
            }
            case 5: {
                System.out.println("Вам предстоит пострелять из пистолета!");
                Pistol pistol = new Pistol();
                String v;
                System.out.println("Хотите задать количество патронов или возьмёте полностью заряженный пистолет?" +
                        "\nЕсли хотите задать количество патронов введите 'да', если хотите полностью заряжённый, то 'нет'");
                v = scanner.next();
                switch (v) {
                    case ("да"): {
                        pistol.setCount();
                        System.out.println(pistol.toString());
                        pistol.Shot();
                        break;
                    }
                    case ("нет"): {
                        System.out.println(pistol.toString());
                        pistol.Shot();
                        break;
                    }
                    default: System.out.println("Нет такого выбора ответа!");
                    break;
                }
                break;
            }
            default: System.out.println("Нет такого задания");
            break;
        }
    }
}