package practice08;

public class Teacher extends Person {
    public Klass getKlass() {
        return klass;
    }

    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klass = null;
    }

    @Override
    public String introduce() {
        return super.introduce() +
                ((klass == null) ? " I am a Teacher. I teach No Class." :
                        String.format(" I am a Teacher. I teach Class %d.", klass.getNumber()));
    }

    public String introduceWith(Student student) {
        String diff = student.getKlass().getNumber() == this.klass.getNumber() ? "" : "don't ";
        return super.introduce() + String.format(" I am a Teacher. I %steach %s.", diff, student.getName());
    }
}
