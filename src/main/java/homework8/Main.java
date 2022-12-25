package homework8;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Vasya", 50),
                new Cat("Mars", 50),
                new Cat("Snezhok", 25),
                new Cat("Murzik", 5),
                new Cat("Kote", 1)};
        Plate plate = new Plate(101);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
