public class Department {
    private String Title;
    private Worker Chief;

    public String getTitle() {
        return Title;
    }

    public Worker getChief() {
        return Chief;
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
    }

    public boolean isChief(Worker worker) {
        if (Chief!=null && Chief.equals(worker)) {
            return true;
        } else {
            return false;
        }
    }

    public Department(String Title, Worker Chief) {
        this.Title = Title;
        this.Chief = Chief;
    }

    @Override
    public String toString() {
        return Title;
    }
}
