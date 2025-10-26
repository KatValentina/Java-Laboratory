import java.util.*;

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

    public boolean checkName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        while (!(Metods.correctPeople(name))) {
            System.out.print("Введено не корректное имя.\n" +
                    "Пожалуйста,введите заново: ");
            name = scanner.nextLine();
        }
        if (record.get(name)==null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер: ");
        String num = scanner.nextLine();

        while (!(num.matches("\\d+") && num.length()==11)) {
            System.out.print("Введено не корректное имя.\n" +
                    "Пожалуйста,введите заново: ");
            num = scanner.nextLine();
        }
        return record.containsValue(num);
    }

    public int sizeBook(){
        return record.size();
    }

    public String[] allPair() {
        String[] arr = new String[record.size()];
        int i=0;
        for (Map.Entry<String, String> entry : record.entrySet()) {
            arr[i] = entry.getKey() + "-" + entry.getValue();
            i++;
        }
        return arr;
    }

    public String[] allName() {
        return record.keySet().toArray(new String[0]);
    }

    public String[] allNumber() {
        return record.values().toArray(new String[0]);
    }

    public PhoneBook() {
        this.record = new HashMap<>();
    }

    @Override
    public String toString() {
        if (record.isEmpty()) {
            return "Справочник пуст";
        } else {
            String full="";
            for (Map.Entry<String, String> entry : record.entrySet()) {
                if (full.isEmpty()) {
                    full = entry.getKey() + "-" + entry.getValue();
                } else {
                    full = full + ", "+entry.getKey() + "-" + entry.getValue();
                }
            }
            return full;
        }
    }
}
