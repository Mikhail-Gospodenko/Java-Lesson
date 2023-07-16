package homework12;

import java.util.ArrayList;
import java.util.HashMap;

//    Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
//    искать номер телефона по фамилии. Следует учесть, что под одной фамилией
//    может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

public class PhoneBook {
    private static int num = 0;
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();

    public static void main(String[] args) {


        HashMap<String, String> phoneList = new HashMap<>();

        phoneList.put("Пупкин", "8(800)555-35-35");
        phoneList.put("Захаров", "8(495)415-82-82");
        phoneList.put("Петров", "8(800)410-20-20");
        phoneList.put("Перов", "8(800)474-58-58");
        phoneList.put("Костенко", "8(496)274-16-79");
        phoneList.put("Печкин", "8(925)316-65-82");
        phoneList.put("Сидоров", "8(903)155-20-90");
        phoneList.put("Пупкин", "8(903)675-75-10");
        phoneList.put("Печкин", "8(495)613-43-04");
        phoneList.put("Пупкин", "8(800)410-20-20");

    }

    public void add(String surname, String phone) {
        ArrayList<String> strings = phoneMap.get(surname);

        System.out.println("String = " + strings);

        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        } else {
            strings.add(phone);
            phoneMap.put(surname, strings);
        }

    }

    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

    public void tusk2() {
        add("Сопочкин", "8(820)410-20-20");
        get("Печкин");
    }
}

