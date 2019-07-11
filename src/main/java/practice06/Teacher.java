package practice06;

public class Teacher extends Person {
    public int getKlass() {
        return klass;
    }

    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        klass = -1;
    }

    @Override
    public String introduce() {
        return super.introduce() +
                ((klass == -1) ? " I am a Teacher. I teach No Class." :
                        String.format(" I am a Teacher. I teach Class %d.", klass));
    }
}
