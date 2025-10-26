public class Name {
    private final String surname;
    private final String naMe;
    private final String middleN;

    public String getSurname() {
        return surname;
    }

    public String getNaMe() {
        return naMe;
    }

    public String getMiddleN() {
        return middleN;
    }

    public Name(String sname,String name, String miname) {
        if (Metods.isVoid(sname) && Metods.isVoid(name) && Metods.isVoid(miname)) {
            throw new IllegalStateException("\nКак минимум один параметр должен иметь не null " +
                    "значение и не пустую строку.");
        } else {
            this.surname = sname;
            this.naMe = name;
            this.middleN = miname;
        }
    }

    public Name(String sname,String name) {
        this.surname = sname;
        this.naMe = name;
        this.middleN = null;
    }

    public Name(String name) {
        this.surname = null;
        this.naMe = name;
        this.middleN = null;
    }

    @Override
    public String toString() {
        String fullname=null;
        if ( !(Metods.isVoid(naMe)) && (
                (!(Metods.isVoid(surname)) && !(Metods.isVoid(middleN)))
                || (!(Metods.isVoid(surname)) && (Metods.isVoid(middleN)))
                || ((Metods.isVoid(surname)) && (Metods.isVoid(middleN)))
                )) {

            if (!Metods.isVoid(surname)) {
                fullname = surname;
            }

            if (!Metods.isVoid(naMe)) {
                if (fullname!=null) {
                    fullname = fullname+" "+ naMe;
                } else {
                    fullname = naMe;
                }
            }

            if (!Metods.isVoid(middleN)) {
                if (fullname!=null) {
                    fullname = fullname+" "+ middleN;
                } else {
                    fullname = middleN;
                }
            }
            return fullname;
        } else {
            throw new IllegalStateException("Нельзя создать имя такого формата!");
        }
    }
}
