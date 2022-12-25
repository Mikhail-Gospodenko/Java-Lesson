package homework8;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    boolean decreaseFood (int n){
        int diff = food - n;
        if(diff < 0)
            return false;
        food -= n;
        return true;
    }
    public void increaseFood(int i){
        food += i;
    }
    public void info (){
        System.out.println("Plate: " + food);
    }
}
