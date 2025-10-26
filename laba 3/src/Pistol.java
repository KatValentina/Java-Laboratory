public class Pistol {
    private int count;
    private final int maxCount;

    public void setCount(int count) {
        this.count = count;
    }

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
        if(maxCount<=0) {
            throw new IllegalArgumentException("Патронник не может вмещать менее 0 патронов. Пистолет не может" +
                    " быть создан.");
        } else {
            this.maxCount = maxCount;
            this.count = 0;
        }
    }

    public int reload(int cartridges) {
        if (cartridges<0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным.");
        } else {
            int spacePlace = maxCount - count;
            if (spacePlace>= cartridges) {
                setCount(getCount() + cartridges);
                return 0;
            } else {
                int full = cartridges - spacePlace;
                setCount(getCount() + spacePlace);
                return full;
            }
        }
    }

    public boolean isСharged(Pistol gun) {
        if (gun.count>0) {
            return true;
        } else {
            return false;
        }
    }

    public void shot(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Количество выстрелов не может быть отрицательно");
        } else {
            for (int i = n;i>0;i--){
                if (getCount()>0){
                    System.out.println("Бах!");
                    this.count = getCount() -1;
                } else {
                    System.out.println("Клац!");
                }
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
