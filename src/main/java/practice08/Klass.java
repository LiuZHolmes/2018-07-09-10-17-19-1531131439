package practice08;

public class Klass {
    public int getNumber() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    private int number;

    public Student getLeader() {
        return leader;
    }

    private Student leader;

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
