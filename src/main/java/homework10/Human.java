package homework10;

public class Human {
    String name;
    int maxRun;
    int maxJump;
    public Human(String name, int maxRun, int maxJump){
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public void run (){
        System.out.println("Пробежал");
    }
    public void jump (){
        System.out.println("Прыгнул");
    }
}
