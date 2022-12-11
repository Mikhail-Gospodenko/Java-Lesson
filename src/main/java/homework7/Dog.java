package homework7;

public class Dog extends Animal {
    public Dog(){
    }
    public void run(int length){
        if(length < 500){
            System.out.println("Собака " + name + " пробежала " + length + " метров");
        } else{
            System.out.println("Собака " + name + " не может пробежать " + length + "метров");
        }
    }
    public void swim(int length){
        if(length < 10){
            System.out.println("Собака " + name + " проплыла " + length + " метров");
        } else{
            System.out.println("Собака " + name + " не может проплыть " + length + "метров");
        }
    }
}
