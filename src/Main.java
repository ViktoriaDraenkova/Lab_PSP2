import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Утро трудового будня, все спешат на работу...");

        Driver Vova =new Driver("Vladzimir", "Golov", 13, true, true, true, 100);
        System.out.println("Водитель: "+Vova.name);
        Vova.sayHello();
        Conductor Sveta = new Conductor(true, true, "Svetlana", "Bobrova", 35, true);
        System.out.println("Кондуктор:"+ Sveta.name);
        Sveta.sayHello();

        ArrayList<Human> people = new ArrayList<>();
        Person Vasya = new Person(true, true, "Vasya", "Popov", 25, true);
        Person Natasha = new Person(true, true, "Natasha", "Pavlova", 22, true);
        Person Olga = new Person(true, true, "Olga", "Popova", 27, true);
        Person Sasha = new Person(true, true, "Sasha", "Petrova", 43, true);
        Person Lena = new Person(true, true, "Lena", "Dunaeva", 16, true);
        people.add(Vasya);
        people.add(Natasha);
        people.add(Olga);
        people.add(Sasha);
        people.add(Lena);
        people.add(Vova);
        people.add(Sveta);

        for (Human h: people) {
            System.out.println(h.toString());
        }
    }
}