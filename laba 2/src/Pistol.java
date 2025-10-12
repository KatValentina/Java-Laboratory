import java.util.Scanner;


public class Pistol {
    private int Count;

    public void setCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество патронов: ");
        Count = scanner.nextInt();
        while (Count<0 || Count>5) {
            System.out.println("Не может быть такого количества патронов. Введите другое количество: ");
            Count = scanner.nextInt();
        }
        this.Count = Count;
    }

    public int getCount() {
        return Count;
    }

    public Pistol() {
        this.Count = 5;
    }

    public void Shot() {
        int count = getCount();
        for (int i = 5;i>=0;i--){
            if (count>0){
                System.out.println("Бах!");
                count--;
            } else {
                System.out.println("Клац!");
            }
        }
    }

    @Override
    public String toString() {
       return "Пистолет готов к стрельбе, количество патронов: "+getCount();
    }
}
