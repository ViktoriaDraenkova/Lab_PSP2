public class Conductor extends Human implements IWorkable {
    private boolean uniform;
    private boolean medicalSertificate;

    Conductor(boolean uniform, boolean medicalSertificate, String name, String secondName, int age, boolean state) {
        super(name, secondName, age, state);
        this.uniform = uniform;
        this.medicalSertificate = medicalSertificate;
    }

    public boolean uniform() {
        return uniform;
    }

    public boolean medicalSertificate() {
        return medicalSertificate;
    }

    public void setMedicalSertificate(boolean medicalSertificate) {
        this.medicalSertificate = medicalSertificate;
    }

    public void setUniform(boolean uniform) {
        this.uniform = uniform;
    }

    @Override
    public void sayHello() {
        if (isWorkable()) {
            System.out.println("Зравствуйте, предоставьте, пожалуйста, билеты для проверки!");
        }
    }


    @Override
    public boolean isWorkable() {
        if(uniform){
            System.out.println("Готова к работе!");
            return true;
        } else {
            System.out.println("Что-то случилось с формой... Выдайте, пожалуйста, новую!");
            uniform = true;
            return true;
        }
    }

    @Override
    public String toString() {
        String str =super.toString();
        return (str+" наличие мед справки : "+medicalSertificate);
    }
    @Override
    public boolean equals(Object ob) {
        Conductor conductor = (Conductor) ob;
        return super.equals(conductor) && this.medicalSertificate == conductor.medicalSertificate;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + 21;
    }

}
