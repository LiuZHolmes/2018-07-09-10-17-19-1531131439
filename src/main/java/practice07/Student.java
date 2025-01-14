package practice07;

public class Student extends Person {

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + String.format(" I am a Student. I am at Class %d.", klass.getNumber());
    }
}
