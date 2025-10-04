import java.util.Scanner;

public class Human {
    private String Name;
    private int height;

    public int getHeight() {
        return height;
    }

    public String getName() {
        return Name;
    }

    public void setHeight(int height) {
        while (height<60 || height>270) {
            System.out.print("Такого роста человек не существует. Введите другое: ");
            Scanner scanner = new Scanner(System.in);
            height = scanner.nextInt();
        }
        this.height = height;
    }

    //стандартный человек (по умолчанию)
    public Human() {
        this.Name = "Иван";
        this.height = 165;
    }

    public void createHuman() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int h;
        System.out.print("Введите имя человека: ");
        name = scanner.nextLine();
        setName(name);
        System.out.print("Введите рост человека: ");
        h = scanner.nextInt();
        setHeight(h);
    }

    @Override
    public String toString() {
        return Name+", рост: "+height;
    }

    public void setName(String Name) {
        Scanner scanner = new Scanner(System.in);
        Metods t = new Metods();
        boolean c;
        c = t.CorrectName(Name);

        while (!c) {
            System.out.print("Неверно введённое имя. Введите другое: ");
            Name = scanner.nextLine();
            c = t.CorrectName(Name);
        }
        this.Name = Name;
    }

}
