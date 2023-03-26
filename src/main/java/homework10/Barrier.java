package homework10;

public interface Barrier {
    default void going(int maxNum, int i) {
        if (maxNum >= i) {
            System.out.println("Успешно прошел");
        } else {
            System.out.println("Не смог пройти");
        }
    }
}
