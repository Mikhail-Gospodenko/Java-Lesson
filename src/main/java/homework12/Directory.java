package homework12;

import java.util.*;

// Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер
// телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

public class Directory {
    private Map<String, String> dirMap;

    public Directory() {
        //TODO сделать конструктор по умолчанию с инициализацией 3 телефонных номеров
        // dirMap.put();
    }

    public void add(String number, String name) {
        //TODO добавляем в dirMap новые ключ-значение
    }

    public Map<String, String> getPhoneByName(String name) {
        Map<String, String> resultMap = new HashMap<>();

        //TODO: делаем поиск по dirMap и совпадения кладем в resultMap

        return resultMap;
    }
}

