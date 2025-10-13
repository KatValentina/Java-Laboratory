import java.util.Scanner;

public class Department {
    private String title;
    private Worker chief;
    private Worker[] workers;//3 задание
    private int workerCount;

    public String getTitle() {
        return title;
    }

    public Worker getChief() {
        return chief;
    }

    public int getWorkerCount() { //3 задание
        return workerCount;
    }

    // Геттер для 3 задания
    public Worker[] getWorkers() {
        Worker[] result = new Worker[workerCount];
        for (int i = 0; i < workerCount; i++) {
            result[i] = workers[i];
        }
        return result;
    }

    public void setChief(Worker chief) {
        chief = chief;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Department(String Title) {
        this.title = Title;
        this.chief = null;
        this.workers = new Worker[50];// 3 задание
        this.workerCount = 0;
    }

    public boolean isChief(Worker worker) {
        if (chief!=null && chief.equals(worker)) {
            return true;
        } else {
            return false;
        }
    }

    // Проверка наличия сотрудника в отделе
    private boolean containsWorker(Worker worker) {
        for (int i = 0; i < workerCount; i++) {
            if (workers[i] != null && workers[i].equals(worker)) {
                return true;
            }
        }
        return false;
    }

    // добавление сотрудника в отдел
    public void addWorker(Worker worker) {
        if (worker != null && workerCount < workers.length && !containsWorker(worker)) {
            workers[workerCount] = worker;
            workerCount++;
        }
    }

    @Override
    public String toString() {
        return title;
    }
}
