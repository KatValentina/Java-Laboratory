public class Machine extends Pistol {
    private final int rateOffire;

    public int getRateOffire(){
        return rateOffire;
    }

    public Machine() {
        super(30);
        this.rateOffire = 30;
    }

    public Machine(int maxCount) {
        super(maxCount);
        int c = maxCount/2;
        if (c==0) {
            throw new IllegalArgumentException("Максимальное количество патронов слишком маленькое.\n" +
                    "Скорострельность не может быть равна 0");
        } else {
            this.rateOffire = c;
        }
    }

    @Override
    public void shot(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Количество выстрелов не отрицательно !");
        } else {
            n = rateOffire;
            System.out.println("Так как это автомат, то количество выстрелов равно скорострельности," +
                    "то-есть: "+getRateOffire());
            for (int i = 0; i < n; i++) {
                if (getCount() > 0) {
                    System.out.println("Бах!");
                    setCount(getCount() - 1);
                } else {
                    System.out.println("Клац!");
                }
            }
        }
    }

    public void shotSec(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Количество секунд не должно быть отрицательно");
        } else {
            n = n*rateOffire;
            for (int i = 0;i<n;i++){
                if (getCount()>0){
                    System.out.println("Бах!");
                    setCount(getCount() - 1);
                } else {
                    System.out.println("Клац!");
                }
            }
        }
    }

    public Machine(int maxCount,int fire) {
        super(maxCount);
        if (fire<=0) {
            throw new IllegalArgumentException("Максимальное количество патронов слишком маленькое.\n" +
                    "Скорострельность не может быть ровна 0 или быть отрицательной");
        } else {
            this.rateOffire = fire;
        }
    }

    @Override
    public String toString() {
        return "Автомат найден. Количество патронов: " + getCount() +
                ". Заряжен? " + isCharged(this) +
                ". Вместимость: " + getMaxCount() +
                ". Скорострельность: " + rateOffire+ " выстр/сек";
    }

}
