package homework7;

public class Cat extends Animal {
    public Cat() {
    }

    public void run(int length) {
        if (length < 200) {
            System.out.println("Кот " + name + "пробежал " + length + " метров");
        } else {
            System.out.println("Кот" + name + " не сможет пробежать " + length + " метров");
        }
    }

    public void swim() {
        System.out.println("Кот не умеет плавать");
    }
}
