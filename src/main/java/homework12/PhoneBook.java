package homework12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//    Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
//    искать номер телефона по фамилии. Следует учесть, что под одной фамилией
//    может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

public class PhoneBook {
    private HashMap<String, List<String>> phoneMap = new HashMap<>();

    public void add(String surname, String phone) {
        List<String> phoneNumbers = phoneMap.get(surname);

        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phone);
            phoneMap.put(surname, phoneNumbers);
        } else {
            phoneNumbers.add(phone);
        }
    }

    public void showPhoneBook() {
        System.out.println(phoneMap);
    }

    public List<String> get(String surname) {
        return phoneMap.get(surname);
    }
}

