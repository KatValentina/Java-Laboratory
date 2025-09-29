import java.util.Scanner;

public class Metods {

    //проверка имени для задания 1.2
    boolean CorrectName(String s) {
        if (s.length()<2 || s.charAt(0)=='-' || s.charAt(s.length()-1)=='-') {
            return false;
        } else {
            for (char c : s.toCharArray()) {
                if (!((c>='А'&& c<='я')||(c=='-'))) {
                    return false;
                }
            }
            return true;
        }
    }


    //проверка имени на допустимые символы в задании 1.3
    boolean correctName(String s) {
        if (s==null) {
            return true;
        }
        if (s.isEmpty()) {
            return true;
        }

        if (s.charAt(0)=='-' || s.charAt(s.length()-1)=='-') {
           return false;
        } else {
            for (char c : s.toCharArray()) {
                if (!((c>='А'&& c<='я')||(c=='-'))) {
                    return false;
                }
            }
            return true;
        }
    }

    //доп метод для заполнения массива 1.3
    public Name[] addArr(int n) {
        Name[] arr = new Name[n];
        System.out.println("Имя человека должно быть не менее 2 знаков, не содержать знаки препинания,\nтабуляции, пробелы, " +
                "а также цифры. Но может содержать дефис. Принимается имя, написанное только кириллицей.");
        for (int i=0;i<n;i++) {
            Name person = new Name();
            person.createName();
            arr[i] = person;
        }
        return arr;
    }

    //доп метод для заполнения массива 1.2
    public Human[] add(int n) {
        Human[] arr = new Human[n];
        System.out.println("Имя человека должно быть не менее 2 знаков, не содержать знаки препинания,\nтабуляции, пробелы, " +
                "а также цифры. Но может содержать дефис. Принимается имя, написанное только кириллицей.");
        for (int i=0;i<n;i++) {
            Human person = new Human();
            person.createHuman();
            arr[i] = person;
        }
        return arr;
    }

}
