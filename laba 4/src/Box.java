public class Box<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public Box(){
        this.object = null;
    }

    //проверка на заполненность
    public boolean isEmpty(){
        if (this.object == null) {
            return true;
        } else {
            return false;
        }
    }


    //положить в коробку
    public void putObject(T object){
        if (!isEmpty()) {
            throw new IllegalStateException("В коробке уже есть предмет!");
        }
        this.object = object;
    }
    //забираем предмет
    public T takeObject() {
        if (isEmpty()) {
            throw new IllegalStateException("\nКоробка пуста");
        } else {
            T value = getObject();
            this.object = null;
            return value;
        }
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "Коробка пуста!";
        } else {
            return "В коробке лежит: "+ getObject();
        }
    }
}
