package homework7;

public class Animal {
    protected String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int length) {
        System.out.println(name + " пробежал " + length + " метров");
    }

    public void swim (int length) {
        System.out.println(name + " проплыл " + length + " метров");
    }

    public static int getCount() {
        return count;
    }
}
