package homework10;

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
        new Racetrack(50);
        new Roadblock(50);
        new Roadblock(25);
        new Racetrack(20);
        new Racetrack(1);


        Participant[] participantArray = new Participant[4];
        participantArray[0] = new Robot(10, 10);
        participantArray[1] = new Cat(1, 1);
        participantArray[2] = new Human(50, 25);
        participantArray[3] = new Robot(50, 50);
        participantArray[4] = new Cat(20, 50);

        for(int i = 0; i < participantArray.length; i++){

        }
    }
}


