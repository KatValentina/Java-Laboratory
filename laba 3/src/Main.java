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
                    String name,issue,oldN;

//                    System.out.println("\nВы можете проверить, есть ли контакт с конкретным именем в справочнике.");
//                    System.out.println("Есть ли этот человек в справочнике: "+book.checkName());

                    System.out.print("\nВведите имя контакта,которого хотите внести в справочник: ");
                    name = scanner.nextLine();
                    System.out.print("Введите его номер: ");
                    issue = scanner.nextLine();
                    oldN = book.addRecord(name,issue);
                    System.out.println("Результат добавления номера. Старый номер: "+oldN);
//
//                    System.out.println("Массив всех имён контактов:");
                    String[] arr = book.allName();
//                    Metods.printArr(arr);

                    System.out.println("\nВы можете проверить, есть ли в справочнике номер человека.");
                    System.out.println("Есть ли этот контакт в справочнике: "+book.checkNumber());

                    System.out.println("Полный массив номеров в справочнике: ");
                    arr = book.allNumber();
                    Metods.printArr(arr);
//
//                    System.out.println("\nВы можете удалить контакт.");
//                    book.delRecord();

                    System.out.println("Изменённый список контактов: ");
                    arr = book.allPair();
                    Metods.printArr(arr);
                    System.out.print("Количество пар Имя-номер в справочнике: "+book.sizeBook());

//                    System.out.println("\nВы можете найти номер конкретного контакта в справочнике.");
//                    oldN = book.returnNumber();
//                    System.out.print("Номер контакта: "+oldN);

                }catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }

                break;
            }
            case "3": {
                System.out.println("1 - автомат по умолчанию( патронник вмещает 30 патронов, Скорострельность 30 выстр/сек)" +
                        "\n2 - автомат, с указанием размера патронника, но скорострельность равна половине обоймы" +
                        "\n3 - автомат, где можно указать и размер патронника, и скорострельность");
                System.out.print("Сейчас вам предстоит создать автомат. Выберите способ: ");
                try {
                    String chois = scanner.nextLine();
                    Machine pistol=null;
                    int maxCartridges, speed,remains;
                    switch (chois) {
                        case "1": {
                            pistol = new Machine();
                            System.out.println(pistol.toString());
                            break;
                        }
                        case "2": {
                            System.out.println("Сейчас вы введёте размер патронника.");
                            maxCartridges = Metods.isInt();
                            pistol = new Machine(maxCartridges);
                            System.out.println(pistol.toString());
                            break;
                        }
                        case "3": {
                            System.out.println("Сейчас вы введёте размер патронника.");
                            maxCartridges = Metods.isInt();
                            System.out.println("Нужно указать скорострельность");
                            speed = Metods.isInt();
                            pistol = new Machine(maxCartridges,speed);
                            System.out.println(pistol.toString());
                            break;
                        }
                        default: System.out.println("Нет способа создания");
                        break;
                    }

                    if (pistol==null) {
                        throw new IllegalStateException("Автомат не был создан.");
                    } else {
                        System.out.println("\nСколько патронов зарядить в пистолет?");
                        int cartridges = Metods.isInt();
                        remains = pistol.reload(cartridges);
                        System.out.println("Лишние патроны, которые не вошли в патронник: "+remains);
                        System.out.println(pistol.toString());

                        System.out.println("1 - количество выстрелов соответствует скорострельности" +
                                "\n2 - стрелять n секунд из автомата ");
                        System.out.print("Как вы хотите стрелять? ");
                        String s = scanner.nextLine();
                        switch (s) {
                            case "1": {
                                pistol.shot(pistol.getRateOffire());
                                System.out.println(pistol.toString());
                                break;
                            }
                            case "2": {
                                System.out.println("Вам предстоит ввести в течении скольки секунд из автомата будете стрелять");
                                int sec = Metods.isInt();
                                pistol.shotSec(sec);
                                System.out.println(pistol.toString());
                                break;
                            }
                            default: System.out.println("Нет способа");
                            break;
                        }
                    }
                }catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            default: System.out.println("Нет такого задания");
            break;

        }
    }
}