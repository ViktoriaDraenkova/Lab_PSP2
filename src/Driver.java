public class Driver extends Human implements IWorkable{
    private boolean driversLicense;
    private boolean uniform;
    private int healthLevel;
    Driver(String name, String secondName, int age, boolean state, boolean driversLicense, boolean uniform, int healthLevel){
        super(name, secondName, age, state);
        this.driversLicense=driversLicense;
        this.uniform=uniform;
        this.healthLevel=healthLevel;
    }

    public boolean driversLicense() {
        return driversLicense;
    }

    public boolean uniform() {
        return uniform;
    }

    public int healthLevel() {
        return healthLevel;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public void setUniform(boolean uniform) {
        this.uniform = uniform;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    @Override
    public void sayHello() {
        if (isWorkable()){
            System.out.println("Уважаемые пассажиры! Будьте осторожны, поезд отправляется.");
        }
        else {System.out.println("Уважаемые пассажиры, поезд задерживается! Приносим своои извинения за предоставленныеи неудобства!");}
    }

    @Override
    public boolean isWorkable() {
        if(healthLevel<80){
            System.out.println("Как-то мне не здоровится...");
            return false;
        }
        System.out.println("Да я здоров как бык!");
        if(uniform){
            System.out.println("Готов к работе!");
            return true;
        }
        else {
            System.out.println("Что-то случилось с формой... Выдайте, пожалуйста, новую!");
            uniform = true;
            return true;
        }
    }

    @Override
    public String toString() {
        String str =super.toString();
        return (str+" наличие водительского удостоверения: "+driversLicense);
    }
    @Override
    public boolean equals(Object ob) {
        Driver driver = (Driver) ob;
        return super.equals(driver) && this.driversLicense == driver.driversLicense;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + 84;
    }

}
