package homework8;

public class Cat {
    private String name;
    private boolean hungry;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void eat(Plate p) {
        if (hungry && p.decreaseFood(appetite))
            hungry = false;
    }
    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }
}

