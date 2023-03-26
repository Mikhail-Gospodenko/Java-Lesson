package homework10;

public interface Participant {
    default void running(){
        System.out.println(" Пробежал");
    }
    default void jumping(){
        System.out.println(" Прыгнул");
    }
}
