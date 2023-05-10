public class Main {
    public static void main(String[] args) {
        People person1 = new People();
        People person2 = new People();
        People person3 = new People();
        People person4 = new People();
        People person5 = new People();

        person1.age = 33;
        person1.name = "Oleg";
        person1.weight = 65.5;

        person2.age = 36;
        person2.name = "Olga";
        person2.weight = 54.1;

        person3.age = 48;
        person3.name = "Vlad";
        person3.weight = 88;

        person4.age = 39;
        person4.name = "Alex";
        person4.weight = 100.5;

        person5.age = 54;
        person5.name = "Irina";
        person5.weight = 63;

        double midle_age = (person1.age + person2.age + person3.age + person4.age + person5.age) / 5;
        double midle_weight = (person1.weight + person2.weight + person3.weight + person4.weight + person5.weight) / 5;
        System.out.println("Midle age = " + midle_age + "\nMidle weight = " + midle_weight);

    }
}
