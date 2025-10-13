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
                        System.out.println("Вам предстоит ввести максимальную вместимость патронника.");
                        int maxCartridges = Metods.isPossitive();
                        while (maxCartridges==0) {
                            System.out.println("Патронник не может вмещать 0 патронов. Введите заново!");
                            maxCartridges = Metods.isPossitive();
                        }
                        int remains;
                        Pistol gun = new Pistol(maxCartridges);

                        System.out.println("Сколько патронов зарядить в пистолет?");
                        int сartridges = Metods.isPossitive();
                        remains = gun.reoload(сartridges);
                        System.out.println("Лишние патроны, которые не вошли в патронник: "+remains);
                        System.out.println(gun.toString());

                        System.out.println("Сколько раз будете стрелять?");
                        int n = Metods.isPossitive();
                        gun.Shot(n);

                        System.out.println("Сколько патронов зарядить в пистолет?");
                        сartridges = Metods.isPossitive();
                        remains = gun.reoload(сartridges);
                        System.out.println("Лишние патроны, которые не вошли в патронник: "+remains);

                        System.out.println("Сколько раз будете стрелять?");
                        n = Metods.isPossitive();
                        gun.Shot(n);

                        gun.discharged();
                        System.out.println("Разрядим пистолет.");
                        System.out.println(gun.toString());

                        System.out.println("Сколько раз будете стрелять?");
                        n = Metods.isPossitive();
                        gun.Shot(n);
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