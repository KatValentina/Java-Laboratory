import java.util.Scanner;

public class Name {
    private String Surname;
    private String NaMe;
    private String MiddleN;

    public String getSurname() {
        return Surname;
    }

    public String getNaMe() {
        return NaMe;
    }

    public String getMiddleN() {
        return MiddleN;
    }

    //стандартное имя (по умолчанию)
    public Name() {
        this.Surname = null;
        this.NaMe = null;
        this.MiddleN = null;
    }

    @Override
    public String toString() {
        String fullname=null;
        //задание 4
//        if ((!NaMe.isEmpty() && Surname.isEmpty() && MiddleN.isEmpty()) ||
//                (!NaMe.isEmpty() && !Surname.isEmpty() && MiddleN.isEmpty()) ||
//                (!NaMe.isEmpty() && !Surname.isEmpty() && !MiddleN.isEmpty())) {
//
//            if (Surname!=null && !Surname.isEmpty()) {
//                fullname = Surname;
//            }
//
//            if (NaMe!=null && !NaMe.isEmpty()) {
//                if (fullname!=null) {
//                    fullname = fullname+" "+ NaMe;
//                } else {
//                    fullname = NaMe;
//                }
//            }
//
//            if (MiddleN!=null && !MiddleN.isEmpty()) {
//                if (fullname!=null) {
//                    fullname = fullname+" "+ MiddleN;
//                } else {
//                    fullname = MiddleN;
//                }
//            }
//
//            if (fullname == null) {
//                return "Вы не создали Имя";
//            } else {
//                return fullname;
//            }
//        } else {
//            return "Нельзя создать имя такого формата!";
//        }

        //задание 1.3
        if (Surname!=null && !Surname.isEmpty()) {
            fullname = Surname;
        }

        if (NaMe!=null && !NaMe.isEmpty()) {
            if (fullname!=null) {
                fullname = fullname+" "+ NaMe;
            } else {
                fullname = NaMe;
            }
        }

        if (MiddleN!=null && !MiddleN.isEmpty()) {
            if (fullname!=null) {
                fullname = fullname+" "+ MiddleN;
            } else {
                fullname = MiddleN;
            }
        }

        if (fullname == null) {
            return "Вы не создали Имя";
        } else {
            return fullname;
        }
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

    public void setSurname(String Surname) {
        Surname = inputName(Surname);
        this.Surname = Surname;
    }

    public void setNaMe(String NaMe) {
        NaMe = inputName(NaMe);
        this.NaMe = NaMe;
    }

    public void setMiddleN(String MiddleN) {
        MiddleN = inputName(MiddleN);
        this.MiddleN = MiddleN;
    }


}
