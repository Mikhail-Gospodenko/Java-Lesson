package homework7;

public class Animal {
    int length;
    String name;

    public Animal() {
    }

    public Animal(int length, String name) {
        this.length = length;
        this.name = name;
    }

    public void run(int length) {
        System.out.println(name + "пробежал" + length + "метров");
    }
    public void swim(int length){
        System.out.println(name + "проплыл" + length + "метров");
    }
}
