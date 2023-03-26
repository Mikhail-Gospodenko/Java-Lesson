package homework10.participiant;

public class Cat implements Participant {
    int maxRun;
    int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean running(int runLength) {
        if (maxRun >= runLength) {
            System.out.println(this + " Справился с бегом." + " runLength=" + runLength);
            return true;
        } else {
            System.out.println(this + " Не справился с бегом." + " runLength=" + runLength);
            return false;
        }
    }

    @Override
    public boolean jumping(int jumpHeight) {
        if (maxJump >= jumpHeight) {
            System.out.println(this + " Справился с прыжком." + "jumpHeight=" + jumpHeight);
            return true;
        } else {
            System.out.println(this + " Не справился с прыжком." + "jumpHeight=" + jumpHeight);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                '}';
    }
}

