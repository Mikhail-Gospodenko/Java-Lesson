package homework8;

public class Cat {
    private String name;
    private boolean isHungry;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public void eat(Plate p) {
        if (isHungry && p.decreaseFood(appetite))
            isHungry = false;
    }
    public void info() {
        String hungry = !this.isHungry ? "сыт" : "голоден";
        System.out.println(name + ": " + hungry);
    }
}

