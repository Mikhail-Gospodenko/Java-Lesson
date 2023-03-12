package homework10;

public class Racetrack {
    int length;
    int high;
    public Racetrack(int length, int high){
        this.length = length;
        this.high = high;
    }
    public void running (int maxRun){
        if (maxRun >= length){
            System.out.println("Успешно пробежал");
        } else {
            System.out.println("Не смог пробежать");
        }
    }
    public void jumping (int maxJump) {
        if (maxJump >= high) {
            System.out.println("Успешно перепрыгнул");
        } else {
            System.out.println("Не смог перепрыгнуть");
        }
    }
}
