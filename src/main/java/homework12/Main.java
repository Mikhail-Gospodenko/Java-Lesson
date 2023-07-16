package homework12;

import java.util.*;
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//Найти и вывести список уникальных слов, из которых состоит массив
//(дубликаты не считаем). Посчитать, сколько раз встречается каждое слово

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }


    private static void taskTwo() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Пупкин", "8(800)555-35-35");
        phoneBook.add("Захаров", "8(495)415-82-82");
        phoneBook.add("Петров", "8(800)410-20-20");
        phoneBook.add("Перов", "8(800)474-58-58");
        phoneBook.add("Костенко", "8(496)274-16-79");
        phoneBook.add("Печкин", "8(925)316-65-82");
        phoneBook.add("Сидоров", "8(903)155-20-90");
        phoneBook.add("Пупкин", "8(903)675-75-10");
        phoneBook.add("Печкин", "8(495)613-43-04");
        phoneBook.add("Пупкин", "8(800)410-20-20");

        phoneBook.showPhoneBook();
        System.out.println(phoneBook.get("Пупкин"));
        System.out.println(phoneBook.get("Костенко"));
        System.out.println(phoneBook.get("Не существующая фамилия"));
    }

    public static void taskOne() {
        String[] words = {"собака", "кот", "лицо", "мяч", "кот", "крест", "клавиатура", "рисунок", "рисунок", "кот", "мяч", "мышка", "сок"};

        Map<String, Integer> hm = new HashMap<>();

        for (String i : words) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        System.out.println(hm);

        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }

        for (String key : hm.keySet()) {
            System.out.print(key + " ");
        }
    }
}