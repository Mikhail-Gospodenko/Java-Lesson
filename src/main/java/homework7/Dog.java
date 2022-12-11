package homework7;

public class Dog extends Animal {
    //TODO реализовать подсчет собак
    public Dog(String name){
        super(name);
    }
    public void run(int length) {
        if (length < 500){
            super.run(length);
        } else {
            System.out.println("Собака " + name + " не может пробежать " + length + " метров");
        }
    }
    public void swim(int length) {
        if (length < 10){
            super.swim(length);
        } else{
            System.out.println("Собака " + name + " не может проплыть " + length + " метров");
        }
    }
}
