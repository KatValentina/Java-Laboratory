import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number;
        System.out.print("Введите номер задания: ");
        number = scanner.nextLine();
        switch (number){
            case "1": {
                String num;
                System.out.print("Номер подзадания: ");
                num = scanner.nextLine();
                switch (num) {
                    case "5": {
                        System.out.println("Вам предстоит ввести максимальную вместимость патронника.");
                        try {
                            int maxCartridges = Metods.isInt();
                            int remains;
                            Pistol gun = new Pistol(maxCartridges);

                            System.out.println("Сколько патронов зарядить в пистолет?");
                            int cartridges = Metods.isInt();
                            remains = gun.reload(cartridges);
                            System.out.println("Лишние патроны, которые не вошли в патронник: "+remains);
                            System.out.println(gun.toString());

                            System.out.println("Сколько раз будете стрелять?");
                            int n = Metods.isInt();
                            gun.shot(n);

                            System.out.println("Сколько патронов зарядить в пистолет?");
                            cartridges = Metods.isInt();
                            remains = gun.reload(cartridges);
                            System.out.println("Лишние патроны, которые не вошли в патронник: "+remains);

                            System.out.println("Сколько раз будете стрелять?");
                            n = Metods.isInt();
                            gun.shot(n);

                            remains = gun.discharged();
                            System.out.println("Разрядим пистолет. В пистолете было: "+remains+" патронов.");
                            System.out.println(gun.toString());

                            System.out.println("Сколько раз будете стрелять?");
                            n = Metods.isInt();
                            gun.shot(n);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case "7": {
                        System.out.print("Создайте имя человека.\nВведите личное имя: ");
                        try{
                            String name = Metods.inputName();
                            System.out.print("Введите фамилию: ");
                            String sname = Metods.inputName();
                            System.out.print("Введите отчество: ");
                            String miname = Metods.inputName();
                            if ((Metods.isVoid(name))&&(Metods.isVoid(sname))&&
                                    (Metods.isVoid(miname))) {
                                throw new IllegalStateException("Имя не может быть создано." +
                                        "\nКак минимум один параметр должен иметь не null значение и не пустую строку.");
                            } else {
                                Name person1;
                                if(!(name==null||name.isEmpty())&&(sname==null||sname.isEmpty())&&
                                        (miname==null||miname.isEmpty())) {
                                    person1 = new Name(name);
                                }
                                else if (!(name==null||name.isEmpty())&&!(sname==null||sname.isEmpty())&&
                                        (miname==null||miname.isEmpty())) {
                                    person1 = new Name(sname,name);
                                }else {
                                    person1 = new Name(sname,name,miname);
                                }
                                System.out.print("Имя человека: "+person1.toString());
                            }
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
                System.out.println("Сейчас будет создан справочник. В нём уже будут записаны контакты.");
                PhoneBook book = new PhoneBook();
                try {
                    String s = book.addRecord("Валентина","89020000001");
                    String s1 = book.addRecord("Иван","89660000001");
                    String s2 = book.addRecord("Полина","89660000012");
                    System.out.println("Уже существующие записи в справочнике: "+book.toString());
                    String[] arr = book.allNumber();
                    Metods.printArr(arr);
                }catch (IllegalStateException e) {
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