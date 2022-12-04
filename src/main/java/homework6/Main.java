package homework6;

public class Main {

    public static void main(String[] args) {
        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("Ivanov Ivan", "Engineer", "? ivivan@mailbox.com? ", "892312312", 30000, 30);
        workerArray[1] = new Worker("Petrov Roman", "Senior Engineer", "? petrovr@mailbox.com? ", "890958312", 50000, 43);
        workerArray[2] = new Worker("Shzukov Aleksandr", "Electrician", "? shzusan@mailbox.com? ", "892216792", 30000, 27);
        workerArray[3] = new Worker("Romanov Ivan", "Junior Engineer", "? romanivan@mailbox.com? ", "891108512", 25000, 23);
        workerArray[4] = new Worker("Dolgov Matvey", "Director", "? dolgov@mailbox.com? ", "898091354", 60000, 50);
        for (int i=0; i < workerArray.length; i++) {
            if (workerArray[i].getAge() > 40) {
                workerArray[i].printInfo();
            }
        }
    }
}
