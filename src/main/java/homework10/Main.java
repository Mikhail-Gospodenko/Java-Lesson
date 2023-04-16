package homework10;

import homework10.barrier.Barrier;
import homework10.barrier.Racetrack;
import homework10.barrier.Roadblock;
import homework10.participiant.Cat;
import homework10.participiant.Human;
import homework10.participiant.Participant;
import homework10.participiant.Robot;

public class Main {
    /* 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
    классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
    консоль).
    2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
    должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
    печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
    3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
    этот набор препятствий.
    4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
    на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
    препятствий не идет.
    */
    public static void main(String[] args) {

        Barrier[] barrierArray = new Barrier[4];
        barrierArray[0] = new Racetrack(10);
        barrierArray[1] = new Roadblock(25);
        barrierArray[2] = new Roadblock(50);
        barrierArray[3] = new Racetrack(100);

        Participant[] participantArray = new Participant[4];
        participantArray[0] = new Robot(10, 10);
        participantArray[1] = new Cat(1, 1);
        participantArray[2] = new Human(50, 25);
        participantArray[3] = new Robot(50, 50);

        int currentParticipant = 0;
        boolean isOvercome = false;
        for (Barrier barrier : barrierArray) {
            isOvercome = false;
            while (!isOvercome && currentParticipant < participantArray.length) {
                isOvercome = barrier.going(participantArray[currentParticipant]);
                if (isOvercome) continue;
                currentParticipant++;
            }
        }

        if (isOvercome) {
            System.out.println("Команда справилась с препятствиями");
        } else {
            System.out.println("Команда не справилась с препятствиями");
        }
    }
}


