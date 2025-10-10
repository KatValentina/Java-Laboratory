import java.util.Scanner;

public class Department {
    private String Title;
    private Worker Chief;
    private Worker[] workers;//3 задание
    private int workerCount;

    public String getTitle() {
        return Title;
    }

    public Worker getChief() {
        return Chief;
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
        Chief = chief;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Department(String Title) {
        this.Title = Title;
        this.Chief = null;
        this.workers = new Worker[50];// 3 задание
        this.workerCount = 0;
    }

    public boolean isChief(Worker worker) {
        if (Chief!=null && Chief.equals(worker)) {
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
        return Title;
    }
}
