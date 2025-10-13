import java.util.Scanner;

public class Pistol {
    private int count;
    private final int maxCount;

    public int getCount() {
        return count;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int discharged() {
        int cartridges = getCount();
        this.count = 0;
        return cartridges;
    }

    public Pistol(int maxCount) {
        this.maxCount = maxCount;
        this.count = 0;
    }

    public int reoload(int cartridges) {
        int spacePlace = maxCount - count;
        if (spacePlace>= cartridges) {
            this.count = getCount() + cartridges;
            return 0;
        } else {
            int full = cartridges - spacePlace;
            this.count = getCount() + spacePlace;
            return full;
        }
    }

    public boolean isСharged(Pistol gun) {
        if (gun.count>0) {
            return true;
        } else {
            return false;
        }
    }

    public void Shot(int n) {
        int count = getCount();
        for (int i = n;i>0;i--){
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
        return "Пистолет найден. Количество патронов: "+getCount()+". " +
                "Заряжен ? " + isСharged(this)+". Сколько патронов вмещает? "+
                getMaxCount();
    }
}
