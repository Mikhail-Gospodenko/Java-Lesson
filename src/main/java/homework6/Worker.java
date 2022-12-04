package homework6;

public class Worker {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int pay;
    private int age;

    public Worker(String name, String post, String email, String phoneNumber, int pay, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
    }
    public void printInfo (){
        System.out.print("ФИО " + name + " должность " + post + " почта " + email + " номер телефона " + phoneNumber + " зарплата " + pay + " возраст " + "\n");
    }

    public int getAge() {
        return age;
    }
}
