package homework7;

public class Cat extends Animal {
    //TODO реализовать подсчет котов
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length < 200) {
            super.run(length);
        } else {
            System.out.println(name + " не умеет столько бегать");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }
}
