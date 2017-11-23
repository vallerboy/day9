import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Damian", 2500);
        map.put("Kamil", 5500);
        map.put("Weronika", 7500);

        map.put("Damian", 3000);

        System.out.println(map.get("Damian"));

        map.replace("Kamil", 6000);

        System.out.println(map.get("Kamil"));


        for (Integer integer : map.values()) {
            System.out.println(integer);
        }

        for (String s : map.keySet()) {
            System.out.println("Klucz: " + s);
            System.out.println("Wartosc: "  + map.get(s));
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println("Klucz: " + stringIntegerEntry.getKey());
            System.out.println("Wartosc: "  + stringIntegerEntry.getValue());
        }
    }
}
