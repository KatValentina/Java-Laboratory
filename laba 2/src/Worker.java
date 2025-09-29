import java.util.Scanner;

public class Worker {
    String Name;
    private Department Unit;

    public String getName() {
        return Name;
    }

    public Department getUnit() {
        return Unit;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setUnit(Department Unit) {
        this.Unit = Unit;

        // Добавляем в новый отдел
        if (this.Unit != null) {
            this.Unit.addWorker(this);
        }

    }

    public Worker[] getAllColleagues() {
        if (Unit != null) {
            return Unit.getWorkers();
        }
        return new Worker[0]; // Возвращаем пустой массив, если нет отдела
    }

    public Worker(String Name) {
        this.Name = Name;
        this.Unit = null;
    }

    public Worker(String Name, Department Unit) {
        this.Name = Name;
        setUnit(Unit);
    }

    @Override
    public String toString(){
        if (Name!=null && Unit.getTitle()!=null){
            if (Unit.isChief(this)) {
                return Name+" начальник отдела "+Unit.getTitle();
            } else {
                if (Unit.getChief()==null || Unit.getChief().getName()==null) {
                    return Name+" работает в отделе "+Unit.getTitle()+", у которого нет начальника";
                } else {
                    return Name+" работает в отделе "+Unit.getTitle()+", начальник которого "+Unit.getChief().getName();
                }
            }
        } else {
            return "Важные параметры(такие как название отдела или имя работника) не были созданы!";
        }

    }
}