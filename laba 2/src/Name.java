import java.util.Scanner;

public class Name {
    private String surname;
    private String naMe;
    private String middleN;

    public String getSurname() {
        return surname;
    }

    public String getNaMe() {
        return naMe;
    }

    public String getMiddleN() {
        return middleN;
    }

    public void setSurname(String surname) {
        surname = inputName(surname);
        this.surname = surname;
    }

    public void setNaMe(String naMe) {
        naMe = inputName(naMe);
        this.naMe = naMe;
    }

    public void setMiddleN(String middleN) {
        middleN = inputName(middleN);
        this.middleN = middleN;
    }

    //стандартное имя (по умолчанию)
    public Name() {
        this.surname = null;
        this.naMe = null;
        this.middleN = null;
    }

    public void createName() {
        Scanner scanner = new Scanner(System.in);
        String sname,name,miname;
        System.out.print("Введите фамилию человека: ");
        sname = scanner.nextLine();
        setSurname(sname);
        System.out.print("Введите имя человека: ");
        name = scanner.nextLine();
        setNaMe(name);
        System.out.print("Введите отчество человека: ");
        miname = scanner.nextLine();
        setMiddleN(miname);
    }

    public String inputName(String name) {
        Scanner scanner = new Scanner(System.in);
        Metods t = new Metods();
        boolean c;
        c = t.correctName(name);

        while (!c) {
            System.out.print("Неверно введённые данные. Введите другие: ");
            name = scanner.nextLine();
            c = t.correctName(name);
        }
        return name;
    }

    @Override
    public String toString() {
        String fullname=null;
        //задание 4
        if ((!naMe.isEmpty() && surname.isEmpty() && middleN.isEmpty()) ||
                (!naMe.isEmpty() && !surname.isEmpty() && middleN.isEmpty()) ||
                (!naMe.isEmpty() && !surname.isEmpty() && !middleN.isEmpty())) {

            if (surname!=null && !surname.isEmpty()) {
                fullname = surname;
            }

            if (naMe!=null && !naMe.isEmpty()) {
                if (fullname!=null) {
                    fullname = fullname+" "+ naMe;
                } else {
                    fullname = naMe;
                }
            }

            if (middleN!=null && !middleN.isEmpty()) {
                if (fullname!=null) {
                    fullname = fullname+" "+ middleN;
                } else {
                    fullname = middleN;
                }
            }

            if (fullname == null) {
                return "Вы не создали Имя";
            } else {
                return fullname;
            }
        } else {
            return "Нельзя создать имя такого формата!";
        }

        //задание 1.3
//        if (surname!=null && !surname.isEmpty()) {
//            fullname = surname;
//        }
//
//        if (naMe!=null && !naMe.isEmpty()) {
//            if (fullname!=null) {
//                fullname = fullname+" "+ naMe;
//            } else {
//                fullname = naMe;
//            }
//        }
//
//        if (middleN!=null && !middleN.isEmpty()) {
//            if (fullname!=null) {
//                fullname = fullname+" "+ middleN;
//            } else {
//                fullname = middleN;
//            }
//        }
//
//        if (fullname == null) {
//            return "Вы не создали Имя";
//        } else {
//            return fullname;
//        }
    }
}
