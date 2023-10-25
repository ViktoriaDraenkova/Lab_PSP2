public abstract class Human {
    String name;
    String secondName;
    int age;
    boolean state;

    Human(String name, String secondName, int age, boolean state) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }

    abstract public void sayHello();

    @Override
    public String toString() {
        return (name + " " + secondName + " " + age + " лет");
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null || ob.getClass() != getClass()) {
            return false;
        }
        Human human = (Human) ob;
        return this.age == human.age && this.name == human.name && this.secondName == human.secondName;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + age;
        result = 31 * result + (secondName == null ? 0 : secondName.hashCode());

        return result;
    }
}

