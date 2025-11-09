public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public Box() {
        this.item = null;
    }

    public boolean isEmpty() {
        if (this.item!=null) {
            return true;
        } else {
            return false;
        }
    }

    public void putItem(T item) {
        if(this.item != null) {
            throw new IllegalStateException("В коробке уже есть предмет!");
        }
        this.item = item;
    }

    public T takeItem() {
        if(this.item == null) {
            throw new IllegalStateException("Коробка пуста!");
        }
        T temp = (T) this.item;
        this.item = null;
        return temp;
    }

    @Override
    public String toString() {
        if (this.item == null) {
            return "Box {   } ";
        } else {
            return "Box{" + item + "}";
        }
    }
    
}