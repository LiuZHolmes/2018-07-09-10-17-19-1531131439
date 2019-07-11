package practice08;

public class Student extends Person {

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        boolean isLeader = this.getId() == this.klass.getLeader().getId();
        return super.introduce() + ( isLeader ? String.format(" I am a Student. I am at Class %d.", klass.getNumber())
                :String.format(" I am a Student. I am Leader of Class %d.", klass.getNumber()));
    }
}
