package homework10;

public class Racetrack implements Barrier{
    int length;
    public Racetrack(int length){
        this.length = length;
    }
    public void going(int maxRun, int length){
        if (maxRun >= length)
            System.out.println("Пробежал");
        else{
            System.out.println("Не пробежал");
        }
    }
}
