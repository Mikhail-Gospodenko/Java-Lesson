package homework7;

public class Main {

    public static void main(String[] args) {
        System.out.println("*****Количество животных = " + Animal.getCount());
        Cat cat = new Cat("Барсик");
        cat.run(100);
        cat.run(250);
        cat.swim(100);

        System.out.println("*****Количество животных = " + Animal.getCount());

        Dog dog = new Dog("Бобик");
        dog.run(10);
        dog.run(1000);
        dog.swim(5);
        dog.swim(15);

        System.out.println();
        System.out.println("*****Количество животных = " + Animal.getCount());
    }

}
