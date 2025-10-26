import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private Map <String, String> record;

    //добавление контакта в книгу
    public String addRecord(String name,String number) {
        if (number==null) {
            throw new IllegalStateException("Номер должен быть не null");
        }
        boolean n = Metods.correctPeople(name);
        boolean onlyDigits = number.matches("\\d+");
        if (!n && !onlyDigits && (number.length() != 11)) {
            throw new IllegalStateException("Нельзя добавить данный контакт.\nОдин или оба параметра были заданы не верно");
        } else {
            if (record.get(name)==null) {
                record.put(name, number);
                return "В телефонной книге не было записи об этом контакте, поэтому запись была внесена.";
            } else {
                String old = record.get(name);
                record.put(name, number);
                return old;
            }
        }
    }

    //удаление контакта
    public void delRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя удаляемого контакта: ");
        String name = scanner.nextLine();
        while (!(Metods.correctPeople(name))) {
            System.out.print("Введено не корректное имя.\n" +
                    "Пожалуйста,введите заново: ");
            name = scanner.nextLine();
        }
        String old = record.remove(name);
        if (old==null) {
            System.out.println("Данного человека не было в телефонном справочнике.\n" +
                    "Данные в справочнике остались без изменения");
        } else {
            System.out.println("Успешно удалён контакт "+name+". Из книги удалили номер: "+old);
        }
    }

    //Возвращение номера
    public String returnNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя удаляемого контакта: ");
        String name = scanner.nextLine();
        while (!(Metods.correctPeople(name))) {
            System.out.print("Введено не корректное имя.\n" +
                    "Пожалуйста,введите заново: ");
            name = scanner.nextLine();
        }
        if(record.get(name)==null) {
           return "Контакта с таким именем не было в справочнике.";
        } else {
            return record.get(name);
        }
    }

    public PhoneBook() {
        this.record = new HashMap<>();
    }

    @Override
    public String toString() {
        String full=null;
        for (Map.Entry<String, String> entry : record.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            full = full + ", "+entry.getKey() + "-" + entry.getValue();
        }
        if (full==null) {
            return "Справочник пуст";
        } else {
            return full;
        }
    }
}
