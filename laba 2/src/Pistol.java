import java.util.Scanner;

public class Pistol {
    private int count;

    public void setCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество патронов: ");
        count = scanner.nextInt();
        while (count <0 || count >5) {
            System.out.println("Не может быть такого количества патронов. Введите другое количество: ");
            count = scanner.nextInt();
        }
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Pistol() {
        this.count = 5;
    }

    public void Shot() {
        int count = getCount();
        for (int i = 5;i>0;i--){
            if (count>0){
                System.out.println("Бах!");
                count--;
                this.count = getCount() -1;
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
