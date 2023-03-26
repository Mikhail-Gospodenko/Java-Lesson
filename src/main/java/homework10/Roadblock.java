package homework10;

public class Roadblock implements Barrier {
    int high;

    public Roadblock(int high) {
        this.high = high;
    }

    public void going(int maxJump, int high) {
        if (maxJump >= high)
            System.out.println("Пробежал");
        else {
            System.out.println("Не пробежал");
        }
    }
}
