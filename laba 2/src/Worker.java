import java.util.Scanner;

public class Worker {
    String name;
    private Department unit;

    public String getName() {
        return name;
    }

    public Department getUnit() {
        return unit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker[] getAll() {
        if (unit != null) {
            return unit.getWorkers();
        }
        return new Worker[0];
    }

    public void setUnit(Department unit) {
        this.unit = unit;

        // Добавляем в новый отдел
        if (this.unit != null) {
            this.unit.addWorker(this);
        }

    }

    public Worker(Department Unit) {
        this.name = null;
        setUnit(Unit);
    }

    public Worker(String name, Department unit) {
        this.name = name;
        setUnit(unit);
    }

    @Override
    public String toString(){
        if (name!=null && unit!=null && unit.getTitle()!=null){
            if (unit.isChief(this)) {
                return name+" начальник отдела "+unit.getTitle();
            } else {
                if (unit.getChief()==null || unit.getChief().getName()==null) {
                    return name+" работает в отделе "+unit.getTitle()+", у которого нет начальника";
                } else {
                    return name+" работает в отделе "+unit.getTitle()+", начальник которого "+unit.getChief().getName();
                }
            }
        } else {
            return "Важные параметры(такие как название отдела или имя работника) не были созданы!";
        }
    }
}